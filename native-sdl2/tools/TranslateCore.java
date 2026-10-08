import com.sun.source.tree.*;
import com.sun.source.util.*;
import javax.lang.model.element.*;
import javax.lang.model.type.*;
import javax.tools.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

/** Restricted, typed source translator. Unsupported constructs fail closed. */
public class TranslateCore {
    static Trees trees;
    static final Map<Tree,TreePath> paths = new IdentityHashMap<>();
    static final Map<String,ClassTree> classes = new LinkedHashMap<>();
    static final Set<String> selected = new LinkedHashSet<>(Arrays.asList(
        "Vec3f","Vec3d","Mat3f","Quaternionf","UvCoord","Vertex","Camera",
        "ScalarFieldVertex","IsoSurfaceIntersection","SortableItem","RenderPrimitive",
        "Triangle","MeshObject","TexturedTriangleRasterizer","LineRasterizer",
        "RgbSurface","IndexedSurface", "ObjectSortEntry", "DepthSorter", "ViewFrustum",
        "MarchingCubesTables", "MetaballMesh", "ParticleVertex", "ParticleCloudMesh", "RadialFlareMesh",
        "WireframeMesh", "BackdropMesh", "HeightFieldMesh", "TrackKeyframe", "SplineTrack",
        "SurfacePresenter", "RgbSurfacePresenter", "SceneRenderer", "AseSceneLoader", "IguMeshLoader",
        "Scene", "VehjeScene", "PaaScene", "TravScene", "EvilScene", "LinjanenScene",
        "ByteReaders", "Envelope", "EnvelopeCursor", "ModuleSample", "ModuleInstrument", "ModulePattern",
        "ModuleSequencer", "Mixable", "MixerBusListener", "ModuleVoice", "ModuleChannel", "MixerBus", "ModuleSong", "ModuleLoader",
        "MovieBitReader", "MovieBounds", "MovieTransform", "MovieColorTransform", "MovieCharacter",
        "QuadraticEdge", "MovieScanlineEdge", "MovieFillStyle", "MovieDisplayObject", "MovieFillSpan",
        "MovieShapeDecoder", "MovieBitmap", "MovieRasterizer", "MovieTimeline", "MovieSurfaceBridge", "MovieIntroScene", "GraphicsRoutine", "EndscreenRoutine", "SmoothedFrameTimer", "godog"));
    static String owner;
    static String csv(String s){return "\""+s.replace("\"","\"\"")+"\"";}
    static String arrayElement(TypeMirror t){return t.getKind()==TypeKind.DECLARED && !t.toString().equals("java.lang.String") ? "Ref<Object>" : type(t);}
    static boolean objectArray(Tree t){return t instanceof ArrayAccessTree a && tm(a).getKind()==TypeKind.DECLARED && !type(a).equals("String");}
    static String lvalue(Tree t){return t instanceof ArrayAccessTree a ? "(*("+ex(a.getExpression())+"))["+ex(a.getIndex())+"]" : ex(t);}
    static String sequence(List<? extends ExpressionTree> ts, java.util.function.Function<List<String>,String> fn){
        // C++11 does not specify argument evaluation order. Sequence every argument explicitly.
        if(ts.isEmpty())return fn.apply(List.of());
        List<String> vars=new ArrayList<>();StringBuilder out=new StringBuilder("([&]() { ");
        for(int i=0;i<ts.size();i++){String n="arg"+i;vars.add(n);out.append("auto "+n+" = "+ex(ts.get(i))+"; ");}
        return out+"return "+fn.apply(vars)+"; }())";
    }
    static boolean keep(String cls,String method){return !cls.equals("godog")||Set.of("<init>","KAMAjAk","KAmAJAk","kAMAjAk","KAMajAk","kaMAJAk","KaMajAk","KamAJAk","kaMAjAk","KamajAk","kAMAJAk","kamAJAk","kamajAk","kAMajAk").contains(method);}
    static boolean adapted(String cls,String method){return
        (cls.equals("EndscreenRoutine")&&Set.of("load","render").contains(method)) ||
        (cls.equals("godog")&&Set.of("kamAJAk","kamajAk").contains(method)) ||
        (cls.equals("MovieTimeline")&&Set.of("AmAjAkK","AmajAkK","aMAjakK").contains(method)) ||
        (cls.equals("MovieBitmap")&&method.equals("AMaJaKK")) ||
        (cls.equals("MovieSurfaceBridge")&&Set.of("<init>","majakKa","MajakKa").contains(method)) || (cls.equals("ModuleLoader")&&method.equals("kKAmAjA")) || (cls.equals("RgbSurfacePresenter") && Set.of("AkKaMaJ","AKKaMaJ","aKkaMaJ").contains(method)) || (cls.equals("SurfacePresenter") && method.equals("aKKaMaJ")) || (cls.equals("MetaballMesh") && method.equals("KKAMaJa"));}

    static Element el(Tree t){return trees.getElement(paths.get(t));}
    static TypeMirror tm(Tree t){return trees.getTypeMirror(paths.get(t));}
    static String type(TypeMirror t) {
        switch(t.getKind()) {
            case BOOLEAN:return "bool"; case BYTE:return "std::int8_t"; case SHORT:return "std::int16_t";
            case INT:return "std::int32_t"; case LONG:return "std::int64_t"; case CHAR:return "char16_t";
            case FLOAT:return "float";case DOUBLE:return "double";case VOID:return "void";
            case ARRAY:return "Array<"+arrayElement(((ArrayType)t).getComponentType())+">";
            case DECLARED:
                String name=((TypeElement)((DeclaredType)t).asElement()).getSimpleName().toString();
                if(name.equals("String"))return "String";
                if(name.equals("Cloneable"))return "Ref<Object>";
                return "Ref<"+name+">";
            case NULL:return "std::nullptr_t";
            default:throw new IllegalArgumentException("type: "+t);
        }
    }
    static String type(Tree t){return type(tm(t));}
    static String name(Element e) {
        String n=e.getSimpleName().toString();
        if(e.getKind()==ElementKind.FIELD) {
            for(Element peer:e.getEnclosingElement().getEnclosedElements())
                if(peer.getKind()==ElementKind.METHOD && peer.getSimpleName().contentEquals(n))return n+"_field";
        }
        return n;
    }
    static boolean integral(Tree t){return switch(tm(t).getKind()){case BYTE,SHORT,INT,LONG,CHAR -> true; default -> false;};}
    static String cast(TypeMirror to,String value) {
        switch(to.getKind()) {
            case INT:return "jint("+value+")";
            case LONG:return "jlong("+value+")";
            case BYTE:return "jbyte("+value+")";
            case SHORT:return "jshort("+value+")";
            case ARRAY:return "std::dynamic_pointer_cast<JArray<"+arrayElement(((ArrayType)to).getComponentType())+">>("+value+")";
            case DECLARED:
                String n=((TypeElement)((DeclaredType)to).asElement()).getSimpleName().toString();
                if(n.equals("String"))return "String("+value+")";
                if(n.equals("Cloneable"))n="Object";
                return "std::dynamic_pointer_cast<"+n+">("+value+")";
            default:return "static_cast<"+type(to)+">("+value+")";
        }
    }
    static String args(List<? extends ExpressionTree> ts){return ts.stream().map(TranslateCore::ex).collect(Collectors.joining(", "));}
    static String op(Tree.Kind kind){return switch(kind){
        case PLUS,PLUS_ASSIGNMENT -> "+";case MINUS,MINUS_ASSIGNMENT -> "-";case MULTIPLY,MULTIPLY_ASSIGNMENT -> "*";
        case DIVIDE,DIVIDE_ASSIGNMENT -> "/";case REMAINDER,REMAINDER_ASSIGNMENT -> "%";
        case AND,AND_ASSIGNMENT -> "&";case OR,OR_ASSIGNMENT -> "|";case XOR,XOR_ASSIGNMENT -> "^";
        case LEFT_SHIFT,LEFT_SHIFT_ASSIGNMENT -> "<<";case RIGHT_SHIFT,RIGHT_SHIFT_ASSIGNMENT -> ">>";case UNSIGNED_RIGHT_SHIFT,UNSIGNED_RIGHT_SHIFT_ASSIGNMENT -> ">>>";
        case LESS_THAN -> "<";case LESS_THAN_EQUAL -> "<=";case GREATER_THAN -> ">";case GREATER_THAN_EQUAL -> ">=";
        case EQUAL_TO -> "==";case NOT_EQUAL_TO -> "!=";case CONDITIONAL_AND -> "&&";case CONDITIONAL_OR -> "||";
        default -> throw new IllegalArgumentException("operator "+kind);};}
    static boolean sideEffects(Tree t){
        if(t==null)return false;
        class Effects extends TreeScanner<Void,Void>{boolean found;
            public Void visitMethodInvocation(MethodInvocationTree t,Void v){found=true;return null;}
            public Void visitNewClass(NewClassTree t,Void v){found=true;return null;}
            public Void visitAssignment(AssignmentTree t,Void v){found=true;return null;}
            public Void visitCompoundAssignment(CompoundAssignmentTree t,Void v){found=true;return null;}
            public Void visitUnary(UnaryTree t,Void v){if(Set.of(Tree.Kind.PREFIX_INCREMENT,Tree.Kind.POSTFIX_INCREMENT,Tree.Kind.PREFIX_DECREMENT,Tree.Kind.POSTFIX_DECREMENT).contains(t.getKind()))found=true;return super.visitUnary(t,v);}
        }
        Effects e=new Effects();e.scan(t,null);return e.found;
    }
    static String binary(String operator,Tree left,Tree right){
        if(!operator.equals("&&")&&!operator.equals("||")&&(sideEffects(left)||sideEffects(right)))return "([&]() { auto jtmp_left = "+ex(left)+"; auto jtmp_right = "+ex(right)+"; return "+binaryExpr(operator,left,right,"jtmp_left","jtmp_right")+"; }())";
        return binaryExpr(operator,left,right,ex(left),ex(right));
    }
    static String binaryExpr(String operator,Tree left,Tree right,String a,String b){
        if(type(left).equals("String") || type(right).equals("String")) {
            if(operator.equals("+"))return "(jstr("+a+") + jstr("+b+"))";
        }
        if(integral(left)&&integral(right)) {
            String fn=switch(operator){case "+"->"jadd";case "-"->"jsub";case "*"->"jmul";case "/"->"jdiv";case "%"->"jrem";case "<<"->"jshl";case ">>"->"jshr";case ">>>"->"jushr";default->null;};
            if(fn!=null){String promoted=tm(left).getKind()==TypeKind.LONG || tm(right).getKind()==TypeKind.LONG?"std::int64_t":"std::int32_t";return fn+"(static_cast<"+promoted+">("+a+"), static_cast<"+promoted+">("+b+"))";}
        }
        if(operator.equals("%"))return "std::fmod("+a+", "+b+")";
        return "("+a+" "+operator+" "+b+")";
    }
    static String ex(Tree t) {
        if(t==null)return "";
        if(t instanceof ParenthesizedTree p)return "("+ex(p.getExpression())+")";
        if(t instanceof LiteralTree l){Object v=l.getValue();if(v==null)return "nullptr";
            if(v instanceof String)return "String("+l+")";
            if(v instanceof Float)return Float.toString((Float)v)+"f";
            if(v instanceof Long)return v+"LL";
            return l.toString();}
        if(t instanceof IdentifierTree i){String n=i.getName().toString();if(n.equals("this"))return "self<"+owner+">()";if(n.equals("super"))return "this";
            Element e=el(t);if(e==null)return n;
            if(e instanceof TypeElement)return n;
            if(e.getKind()==ElementKind.FIELD){String base=((TypeElement)e.getEnclosingElement()).getSimpleName().toString();return e.getModifiers().contains(Modifier.STATIC)?base+"::"+name(e):"this->"+name(e);}
            return name(e);}
        if(t instanceof MemberSelectTree s){Element e=el(t);
            if(s.getIdentifier().contentEquals("length") && tm(s.getExpression()).getKind()==TypeKind.ARRAY)return ex(s.getExpression())+"->length";
            String base=e!=null&&e.getEnclosingElement() instanceof TypeElement te?te.getSimpleName().toString():"";
            if(base.equals("Math") && s.getIdentifier().contentEquals("PI"))return "3.141592653589793";
            if(base.equals("Integer") && s.getIdentifier().contentEquals("MAX_VALUE"))return "INT32_MAX";
            if(base.equals("Integer") && s.getIdentifier().contentEquals("MIN_VALUE"))return "INT32_MIN";
            if(base.equals("Float")||base.equals("Double"))return "std::numeric_limits<"+(base.equals("Float")?"float":"double")+">::"+(s.getIdentifier().toString().equals("NaN")?"quiet_NaN()":"infinity()");
            if(e!=null&&e.getModifiers().contains(Modifier.STATIC))return base+"::"+name(e);
            if(s.getExpression().toString().equals("super"))return base+"::"+name(e);
            if(s.getExpression().toString().equals("this"))return "this->"+name(e);
            return "("+ex(s.getExpression())+")->"+(e==null?s.getIdentifier():name(e));}
        if(t instanceof MethodInvocationTree m){Element e=el(m.getMethodSelect());String base=((TypeElement)e.getEnclosingElement()).getSimpleName().toString(), n=e.getSimpleName().toString();
            if(n.equals("<init>"))return "";
            if(base.equals("Math")){
                if(n.equals("random"))return "java_random().nextDouble()";
                if(n.equals("min")||n.equals("max")||n.equals("abs"))return "j"+n+"("+args(m.getArguments())+")";
                return "std::"+n+"("+m.getArguments().stream().map(a->"static_cast<double>("+ex(a)+")").collect(Collectors.joining(", "))+")";
            }
            if(base.equals("Object") && (n.equals("notify")||n.equals("notifyAll")))return "";
            if(base.equals("System")&&(n.equals("gc")||n.equals("runFinalization")))return "";
            if(n.equals("printStackTrace"))return "print_line(String("+ex(((MemberSelectTree)m.getMethodSelect()).getExpression())+".what()))";
            if(base.equals("Float") && n.equals("floatValue"))return "("+ex(((MemberSelectTree)m.getMethodSelect()).getExpression())+")";
            if(base.equals("String")&&n.equals("valueOf"))return "jstr("+args(m.getArguments())+")";
            if(base.equals("String")&&n.equals("intern"))return ex(((MemberSelectTree)m.getMethodSelect()).getExpression());
            if(base.equals("System")&&n.equals("arraycopy"))return "arraycopy("+args(m.getArguments())+")";
            if(base.equals("PrintStream"))return "print_line("+args(m.getArguments())+")";
            if(e.getModifiers().contains(Modifier.STATIC))return sequence(m.getArguments(),vs -> base+"::"+name(e)+"("+String.join(", ",vs)+")");
            if(m.getMethodSelect() instanceof IdentifierTree)return sequence(m.getArguments(),vs -> "this->"+name(e)+"("+String.join(", ",vs)+")");
            if(base.equals("String"))return "("+ex(((MemberSelectTree)m.getMethodSelect()).getExpression())+")."+n+"("+args(m.getArguments())+")";
            return sequence(m.getArguments(), vs -> ex(m.getMethodSelect())+"("+String.join(", ",vs)+")");
        }
        if(t instanceof NewClassTree n){String cls=((TypeElement)((DeclaredType)tm(t)).asElement()).getSimpleName().toString();if(cls.equals("String"))return "String("+args(n.getArguments())+")";
            if(cls.endsWith("Exception"))return "std::runtime_error("+ex(n.getArguments().get(0))+".text)";
            return sequence(n.getArguments(), vs -> "make_ref<"+cls+">("+String.join(", ",vs)+")");}
        if(t instanceof TypeCastTree c)return cast(tm(c.getType()),ex(c.getExpression()));
        if(t instanceof BinaryTree b)return binary(op(t.getKind()),b.getLeftOperand(),b.getRightOperand());
        if(t instanceof AssignmentTree a){
            if(a.getVariable() instanceof ArrayAccessTree ar)return "([&]() { auto jtmp_array = "+ex(ar.getExpression())+"; auto jtmp_index = "+ex(ar.getIndex())+"; auto jtmp_value = "+ex(a.getExpression())+"; (*jtmp_array)[jtmp_index] = jtmp_value; return jtmp_value; }())";
            return "("+ex(a.getVariable())+" = "+ex(a.getExpression())+")";
        }
        if(t instanceof CompoundAssignmentTree a)return "("+ex(a.getVariable())+" = "+cast(tm(a.getVariable()),binary(op(t.getKind()),a.getVariable(),a.getExpression()))+")";
        if(t instanceof UnaryTree u){String x=ex(u.getExpression());return switch(t.getKind()){
            case LOGICAL_COMPLEMENT -> "(!"+x+")";case BITWISE_COMPLEMENT -> "(~"+x+")";
            case UNARY_PLUS -> "(+"+x+")";case UNARY_MINUS -> integral(t)?"jneg("+x+")":"(-"+x+")";
            case PREFIX_INCREMENT -> "jpreinc("+x+")";case PREFIX_DECREMENT -> "jpredec("+x+")";
            case POSTFIX_INCREMENT -> "jpostinc("+x+")";case POSTFIX_DECREMENT -> "jpostdec("+x+")";
            default -> throw new IllegalArgumentException(t.toString());};}
        if(t instanceof ConditionalExpressionTree c)return "("+ex(c.getCondition())+" ? "+ex(c.getTrueExpression())+" : "+ex(c.getFalseExpression())+")";
        if(t instanceof ArrayAccessTree a){String v=lvalue(a);return objectArray(a)?cast(tm(a),v):v;}
        if(t instanceof InstanceOfTree i)return "(std::dynamic_pointer_cast<"+i.getType()+">("+ex(i.getExpression())+") != nullptr)";
        if(t instanceof NewArrayTree a){TypeMirror component=((ArrayType)tm(t)).getComponentType();
            if(a.getInitializers()!=null)return "make_array<"+arrayElement(component)+">({"+args(a.getInitializers())+"})";
            if(a.getDimensions().size()==3)return "make_array3<"+arrayElement(((ArrayType)((ArrayType)component).getComponentType()).getComponentType())+">("+args(a.getDimensions())+")";
            if(a.getDimensions().size()==2)return "make_array2<"+arrayElement(((ArrayType)component).getComponentType())+">("+args(a.getDimensions())+")";
            if(a.getDimensions().size()!=1)throw new IllegalArgumentException("multi array "+a);
            return "make_array<"+arrayElement(component)+">("+ex(a.getDimensions().get(0))+")";}
        if(t instanceof VariableTree v)return variable(v,true);
        throw new IllegalArgumentException("expression "+t.getKind()+": "+t);
    }
    static String variable(VariableTree v,boolean typed){return (typed?type(v.getType())+" ":"")+name(el(v))+(v.getInitializer()!=null?" = "+ex(v.getInitializer()):"{}");}
    static String st(StatementTree s){
        if(s instanceof BlockTree b)return "{\n"+b.getStatements().stream().map(TranslateCore::st).collect(Collectors.joining("\n"))+"\n}";
        if(s instanceof VariableTree v)return variable(v,true)+";";
        if(s instanceof ExpressionStatementTree e){if(owner.equals("godog")&&e.toString().contains("this.KKAMAJA = new Font"))return "// The AWT loading font is replaced by the native window.";String out=ex(e.getExpression());return out.isEmpty()?"":out+";";}
        if(s instanceof ReturnTree r)return "return"+(r.getExpression()==null?"":" "+ex(r.getExpression()))+";";
        if(s instanceof IfTree i)return "if ("+ex(i.getCondition())+") "+st(i.getThenStatement())+(i.getElseStatement()==null?"":" else "+st(i.getElseStatement()));
        if(s instanceof WhileLoopTree w)return "while ("+ex(w.getCondition())+") "+st(w.getStatement());
        if(s instanceof DoWhileLoopTree w)return "do "+st(w.getStatement())+" while ("+ex(w.getCondition())+");";
        if(s instanceof ForLoopTree f){List<String> init=new ArrayList<>();for(var v:f.getInitializer())init.add(v instanceof VariableTree d?variable(d,init.isEmpty()):ex(((ExpressionStatementTree)v).getExpression()));
            return "for ("+String.join(", ",init)+"; "+ex(f.getCondition())+"; "+f.getUpdate().stream().map(v->ex(v.getExpression())).collect(Collectors.joining(", "))+") "+st(f.getStatement());}
        if(s instanceof EnhancedForLoopTree f)return "for (auto jtmp_element : "+ex(f.getExpression())+"->values) { "+type(f.getVariable().getType())+" "+f.getVariable().getName()+" = "+cast(tm(f.getVariable().getType()),"jtmp_element")+"; "+st(f.getStatement())+" }";
        if(s instanceof SynchronizedTree syn)return st(syn.getBlock());
        if(s instanceof ThrowTree thr)return "throw "+ex(thr.getExpression())+";";
        if(s instanceof LabeledStatementTree l)return "{ "+st(l.getStatement())+" } jbreak_"+l.getLabel()+":;";
        if(s instanceof BreakTree b){if(b.getLabel()!=null)return "goto jbreak_"+b.getLabel()+";";return "break;";}
        if(s instanceof ContinueTree c)return "continue;";
        if(s instanceof EmptyStatementTree)return ";";
        if(s instanceof TryTree tr){if(tr.getFinallyBlock()!=null || !tr.getResources().isEmpty())throw new IllegalArgumentException("try resources/finally"); String out="try "+st(tr.getBlock()); for(var c:tr.getCatches())out+=" catch (const std::exception& "+c.getParameter().getName()+") "+st(c.getBlock()); return out;}
        if(s instanceof SwitchTree sw){StringBuilder out=new StringBuilder("switch ("+ex(sw.getExpression())+") {\n");for(var c:sw.getCases()){
            if(c.getExpressions().isEmpty())out.append("default:\n");else for(var e:c.getExpressions())out.append("case ").append(ex(e)).append(":\n");
            for(var x:c.getStatements())out.append(st(x)).append('\n');}return out+";}";}
        throw new IllegalArgumentException("statement "+s.getKind()+": "+s);
    }
    static String params(MethodTree m){return m.getParameters().stream().map(v->type(v.getType())+" "+v.getName()).collect(Collectors.joining(", "));}
    static String signature(MethodTree m,boolean header){boolean ctor=m.getReturnType()==null;boolean stat=m.getModifiers().getFlags().contains(Modifier.STATIC);
        return (header?(stat?"static ":ctor?"":"virtual "):"")+(ctor?"":type(m.getReturnType())+" ")+(header?"":owner+"::")+(ctor?owner:m.getName())+"("+params(m)+")";
    }
    public static void main(String[] a)throws Exception{
        Path repo=Path.of(a[0]),out=repo.resolve("native-sdl2/src/engine");
        String formatter=a.length>1?a[1]:"clang-format";
        Process version=new ProcessBuilder(formatter,"--version").redirectErrorStream(true).start();String formatVersion=new String(version.getInputStream().readAllBytes());
        if(version.waitFor()!=0||!formatVersion.contains("20.1.8"))throw new IllegalStateException("Regeneration requires clang-format 20.1.8 (pass its path as the second argument)");
        var compiler=ToolProvider.getSystemJavaCompiler();var diag=new DiagnosticCollector<JavaFileObject>();var fm=compiler.getStandardFileManager(diag,null,null);
        List<Path> sources;try(var w=Files.walk(repo.resolve("java-desktop/src/main/java"))){sources=w.filter(p->p.toString().endsWith(".java")).toList();}
        var task=(JavacTask)compiler.getTask(null,fm,diag,List.of("-proc:none"),null,fm.getJavaFileObjectsFromPaths(sources));var units=new ArrayList<CompilationUnitTree>();task.parse().forEach(units::add);task.analyze();trees=Trees.instance(task);
        for(var d:diag.getDiagnostics())if(d.getKind()==Diagnostic.Kind.ERROR)throw new IllegalStateException(d.toString());
        for(var u:units)new TreePathScanner<Void,Void>(){
            public Void scan(Tree t,Void v){if(t!=null)paths.put(t,getCurrentPath()==null?new TreePath(u):new TreePath(getCurrentPath(),t));return super.scan(t,v);}
            public Void visitClass(ClassTree c,Void v){classes.put(c.getSimpleName().toString(),c);return super.visitClass(c,v);}
        }.scan(u,null);
        StringBuilder h=new StringBuilder("// Generated from the preserved Java port by tools/TranslateCore.java.\n#pragma once\n#include \"../java_compat.hpp\"\nnamespace godog {\n");
        for(String n:selected)h.append("class ").append(n).append(";\n");
        h.append("class StartupTunerCanvas; class LegacyFullscreenWindow; class IndexedSurfacePresenter; struct Container; struct Font;\n");
        h.append("class MoviePlayer; class MovieAudioClip; class MovieController;\n");
        h.append("struct MAD; struct ScriptEventScheduler; struct SongPositionQueue;\n");
        h.append("class DesktopDemoBase; class ImageMathSupport; class godog;\n");
        h.append("class SoftwareImageSurface;\n");
        StringBuilder cpp=new StringBuilder("// Generated from the preserved Java port by tools/TranslateCore.java.\n#include \"core.hpp\"\n#include \"../surface_platform.hpp\"\nnamespace godog {\n");
        // Platform base is declared before derived surfaces.
        h.append("class SoftwareImageSurface : public Object { public: int32_t width{}, height{}; Ref<ColorModel> colorModel; Ref<ImageConsumer> consumer; SoftwareImageSurface(int32_t w,int32_t h):width(w),height(h),consumer(make_ref<ImageConsumer>()){} virtual void publishRegion(int32_t,int32_t,int32_t,int32_t){} void setImageEnabled(bool){} };\n");
        List<String> blocks=new ArrayList<>();
        for(String n:selected){owner=n;var c=classes.get(n);if(c==null)throw new IllegalStateException(n);
            String base=c.getExtendsClause()==null?(c.getImplementsClause().isEmpty()||c.getImplementsClause().get(0).toString().equals("Runnable")?"Object":c.getImplementsClause().get(0).toString()):c.getExtendsClause().toString();
            h.append("class "+n+" : public "+base+" {\npublic:\n");
            for(var member:c.getMembers())if(member instanceof VariableTree v){boolean stat=el(v).getModifiers().contains(Modifier.STATIC);h.append((stat?"static ":"")+type(v.getType())+" "+name(el(v))+(stat?"":v.getInitializer()!=null?" = "+ex(v.getInitializer()):"{}")+";\n");
                if(stat)cpp.append(type(v.getType())+" "+n+"::"+name(el(v))+(v.getInitializer()==null?"{}":" = "+ex(v.getInitializer()))+";\n");
            }
            for(var member:c.getMembers()){
                if(member instanceof MethodTree m){if(!keep(n,m.getName().toString()))continue;h.append(signature(m,true)+(m.getBody()==null?" = 0;":";")+"\n");if(m.getBody()==null || adapted(n,m.getName().toString()))continue;
                    try{String sig=signature(m,false);String body=st(m.getBody());
                        if(m.getReturnType()==null && !m.getBody().getStatements().isEmpty() && m.getBody().getStatements().get(0) instanceof ExpressionStatementTree e && e.getExpression() instanceof MethodInvocationTree call){
                            String target=call.getMethodSelect().toString();if(target.equals("this")||target.equals("super"))sig+=" : "+(target.equals("this")?n:base)+"("+args(call.getArguments())+")";
                        }
                        cpp.append(sig+" "+body+"\n");
                    }catch(Exception ex){throw new IllegalStateException(n+"."+m.getName()+": "+ex,ex);}
                }else if(member instanceof BlockTree b && b.isStatic()){h.append("static void initialize_static();\n");cpp.append("void "+n+"::initialize_static() "+st(b)+"\n");blocks.add(n);}
            }
            if(n.equals("godog")){
                h.append("void renderFrame();\n");
                MethodTree run=(MethodTree)c.getMembers().stream().filter(x->x instanceof MethodTree m&&m.getName().contentEquals("run")).findFirst().orElseThrow();
                List<IfTree> render=new ArrayList<>();new TreeScanner<Void,Void>(){public Void visitIf(IfTree i,Void v){if(i.getCondition().toString().equals("(this.kkaMAJA != null)"))render.add(i);return super.visitIf(i,v);}}.scan(run,null);
                if(render.size()!=1)throw new IllegalStateException("Cannot identify original compositor");
                cpp.append("void godog::renderFrame() "+st(render.get(0).getThenStatement())+"\n");
            }
            h.append("virtual void releaseReferences();\n");
            cpp.append("void "+n+"::releaseReferences() { ");
            for(var member:c.getMembers())if(member instanceof VariableTree v&&!el(v).getModifiers().contains(Modifier.STATIC)){
                TypeMirror t=tm(v.getType());if(t.getKind()==TypeKind.ARRAY || (t.getKind()==TypeKind.DECLARED&&!type(t).equals("String")))cpp.append(name(el(v))+".reset(); ");
            }
            cpp.append(base+"::releaseReferences(); }\n");
            h.append("};\n");
        }
        h.append("void initialize_engine();\n}\n");cpp.append("void initialize_engine() { static bool done=false; if(done)return; done=true;\n");for(String n:blocks)cpp.append(n+"::initialize_static();\n");cpp.append("}\n}\n");
        StringBuilder coverage=new StringBuilder("java_source,java_class,kind,java_symbol,parameters,cpp_symbol,status\n");
        List<String> classNames=new ArrayList<>(classes.keySet());Collections.sort(classNames);
        for(String n:classNames){var c=classes.get(n);String source=repo.relativize(Path.of(paths.get(c).getCompilationUnit().getSourceFile().toUri())).toString();
            for(var member:c.getMembers()){
                String kind,symbol,parameters="",cppSymbol,status;
                if(member instanceof MethodTree m){kind="method";symbol=m.getName().toString();parameters=m.getParameters().stream().map(v->v.getType().toString()).collect(Collectors.joining(","));
                    status=!selected.contains(n)||!keep(n,symbol)?"platform-or-unused":adapted(n,symbol)?"native-adapter":"translated";
                    cppSymbol=status.equals("platform-or-unused")?"":n+"::"+(symbol.equals("<init>")?n:symbol);
                }else if(member instanceof VariableTree v){kind="field";symbol=v.getName().toString();status=selected.contains(n)?"translated":"platform-or-unused";cppSymbol=selected.contains(n)?n+"::"+name(el(v)):"";}
                else continue;
                coverage.append(Stream.of(source,n,kind,symbol,parameters,cppSymbol,status).map(TranslateCore::csv).collect(Collectors.joining(","))).append('\n');
            }
        }
        Files.writeString(repo.resolve("native-sdl2/correspondence.csv"),coverage);
        Files.writeString(out.resolve("core.hpp"),h);Files.writeString(out.resolve("core.cpp"),cpp);Process format=new ProcessBuilder(formatter,"-i",out.resolve("core.hpp").toString(),out.resolve("core.cpp").toString()).inheritIO().start();
        if(format.waitFor()!=0)throw new IllegalStateException("clang-format failed");
        System.out.println("Translated "+selected.size()+" classes.");
    }
}
