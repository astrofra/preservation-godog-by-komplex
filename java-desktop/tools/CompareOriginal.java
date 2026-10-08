import java.awt.*;
import java.awt.image.*;
import java.lang.reflect.*;
import java.net.*;
import java.nio.file.*;
import javax.imageio.ImageIO;
import java.util.function.Supplier;

/** Optional JDK 25 reference harness. Applet is used reflectively ONLY for archived classes. */
public class CompareOriginal {
    record SceneCase(String originalName, Supplier<Scene> restored) { }
    static Object call(Object o, String name, Class<?>[] types, Object... args) throws Exception {
        Method m = o.getClass().getDeclaredMethod(name, types); m.setAccessible(true); return m.invoke(o,args);
    }
    static Object field(Class<?> c, Object instance, String name) throws Exception {
        Field f=c.getDeclaredField(name); f.setAccessible(true); return f.get(instance);
    }
    static void seed(long seed) throws Exception {
        Field field=Class.forName("java.lang.Math$RandomNumberGeneratorHolder").getDeclaredField("randomNumberGenerator");
        field.setAccessible(true); ((java.util.Random)field.get(null)).setSeed(seed);
    }
    public static void main(String[] args) throws Exception {
        Path root=Path.of(args[0]);
        try (URLClassLoader old=new URLClassLoader(new URL[]{root.resolve("reverse/inputs/godog-decompiler-input.jar").toUri().toURL()},ClassLoader.getPlatformClassLoader())) {
            Class<?> applet=Class.forName("java.applet.Applet"), stub=Class.forName("java.applet.AppletStub");
            URL base=root.resolve("java-desktop/assets/").toUri().toURL();
            Object oldDemo=old.loadClass("godog").getConstructor().newInstance();
            Class<?> context=Class.forName("java.applet.AppletContext");
            Object imageContext=java.lang.reflect.Proxy.newProxyInstance(context.getClassLoader(),new Class[]{context},(p,m,a)->m.getName().equals("getImage")?Toolkit.getDefaultToolkit().getImage((URL)a[0]):null);
            Object adapter=java.lang.reflect.Proxy.newProxyInstance(stub.getClassLoader(),new Class[]{stub},(p,m,a)->switch(m.getName()) {
                case "getCodeBase","getDocumentBase" -> base;
                case "isActive" -> true;
                case "getAppletContext" -> imageContext;
                default -> null;
            });
            applet.getMethod("setStub",stub).invoke(oldDemo,adapter);
            GodogDemo restored=new GodogDemo();
            call(oldDemo,"kAmajAk",new Class[]{}); restored.kAmajAk();
            Object oldRenderer=field(oldDemo.getClass(),null,"KKAMAjA");
            Object oldPixels=field(oldRenderer.getClass(),oldRenderer,"kamAJAk");
            // Keep original lookup strings separate from renamed desktop types.
            SceneCase[] scenes = {
                new SceneCase("maaamma", MovieIntroScene::new),
                new SceneCase("majakkk", PaaScene::new),
                new SceneCase("majakma", TravScene::new),
                new SceneCase("kajjmma", VehjeScene::new),
                new SceneCase("maajkka", EvilScene::new),
                new SceneCase("kmajkmk", LinjanenScene::new)
            };
            float[] times = {0, .02f, .04f, .5f, 1, 5, 9.98f, 10, 10.02f, 19.98f, 20, 20.02f};
            for(SceneCase sceneCase : scenes) {
                String sceneName = sceneCase.originalName();
                Object scene=old.loadClass(sceneName).getConstructor().newInstance();
                Scene current=sceneCase.restored().get();
                seed(888);
                scene.getClass().getMethod("mAjakkA",old.loadClass("kmaamma")).invoke(scene,oldDemo);
                seed(888); current.load(restored);
                seed(888); scene.getClass().getMethod("maJAkkA").invoke(scene); seed(888); current.enter();
                for(float t:times) {
                    seed(888+(int)t);
                    scene.getClass().getMethod("MajakkA",old.loadClass("mmajkka"),float.class,float.class).invoke(scene,oldPixels,t,.02f);
                    seed(888+(int)t); current.render(GodogDemo.kKAMAjA,t,.02f);
                    BufferedImage referenceImage = null;
                    for(int variant=0;variant<2;variant++) {
                        BufferedImage image=new BufferedImage(512,256,BufferedImage.TYPE_INT_RGB);Graphics g=image.getGraphics();
                        if(variant==0) oldRenderer.getClass().getMethod("AKKaMaJ",Graphics.class,int.class,int.class).invoke(oldRenderer,g,0,0);
                        else GodogDemo.KKAMAjA.AKKaMaJ(g,0,0);
                        g.dispose();
                        if (variant == 0) referenceImage = image;
                        else if (!java.util.Arrays.equals(referenceImage.getRGB(0,0,512,256,null,0,512),image.getRGB(0,0,512,256,null,0,512))) {
                            throw new AssertionError("Pixel mismatch: " + sceneName + " at " + t);
                        }
                        Path file=root.resolve("java-desktop/build/bytecode-frames/"+sceneName+"-"+t+"-"+(variant==0?"original":"restored")+".png");Files.createDirectories(file.getParent());ImageIO.write(image,"png",file.toFile());
                    }
                }
                System.out.println("PASS: "+sceneName+" -> "+current.getClass().getSimpleName()+": "+times.length+" frames match original bytecode pixel for pixel.");
            }
        }
        System.exit(0);
    }
}
