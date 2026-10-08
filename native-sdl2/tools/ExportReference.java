import java.io.*;
import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;

/** Test-only export from the working Java port. Never used by the native runtime. */
public class ExportReference {
    static Path out;
    static void seed(long seed)throws Exception{
        Field f=Class.forName("java.lang.Math$RandomNumberGeneratorHolder").getDeclaredField("randomNumberGenerator");
        f.setAccessible(true);((Random)f.get(null)).setSeed(seed);
    }
    static void ints(Path file,int[] pixels)throws Exception{
        Files.createDirectories(file.getParent());try(var stream=new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))){for(int p:pixels)stream.writeInt(p);}
    }
    public static void main(String[]args)throws Exception{
        Path repo=Path.of(args[0]);out=Path.of(args[1]);Files.createDirectories(out);
        Field assets=GodogDesktop.class.getDeclaredField("assets");assets.setAccessible(true);assets.set(null,repo.resolve("java-desktop/assets"));
        godog context=new godog();context.kAmajAk();
        List<String> images=new ArrayList<>();
        try(var walk=Files.list(repo.resolve("java-desktop/assets/images"))){
            for(Path file:walk.sorted().toList()){
                images.add(file.getFileName().toString());
                SoftwareImageSurface s=ImageMathSupport.MAjaKkA(file.toUri().toURL());
                Path target=out.resolve("images/"+file.getFileName()+".bin");Files.createDirectories(target.getParent());
                try(var d=new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(target)))){
                    d.writeInt(s.width);d.writeInt(s.height);d.writeInt(s instanceof IndexedSurface?1:0);
                    if(s instanceof RgbSurface r){for(int p:r.AMAjakk)d.writeInt(p);}
                    else {IndexedSurface i=(IndexedSurface)s;d.write(i.kamAJaK);d.write(i.kaMajaK);d.write(i.KAMajaK);d.write(i.kAMajaK);}
                }
            }
        }
        Files.write(out.resolve("images.txt"),images);
        Scene[] scenes={new MovieIntroScene(),new PaaScene(),new TravScene(),new VehjeScene(),new EvilScene(),new LinjanenScene()};
        float[] times={0,.02f,.04f,.5f,1,5,9.98f,10,10.02f,19.98f,20,20.02f};
        for(Scene scene:scenes){seed(888);scene.load(context);seed(888);scene.enter();
            for(int i=0;i<times.length;i++){seed(888+(int)times[i]);scene.render(godog.kKAMAjA,times[i],.02f);ints(out.resolve(scene.getSceneId()+"-"+i+".bin"),godog.kKAMAjA.AMAjakk);}
        }
        Random random=new Random(888);RgbSurface surface=new RgbSurface(512,256,1,false);LineRasterizer lines=new LineRasterizer(surface,512,256);
        try(var d=new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(out.resolve("lines.bin"))))){
            for(int mode=0;mode<3;mode++)for(int i=0;i<160;i++){
                float x=20+random.nextFloat()*400,y=20+random.nextFloat()*180,x2=i%3==0?x:20+random.nextFloat()*400,y2=i%3==1?y:20+random.nextFloat()*180;
                Arrays.fill(surface.AMAjakk,0);d.writeFloat(x);d.writeFloat(y);d.writeFloat(x2);d.writeFloat(y2);
                if(mode==0)lines.KamAjak(x,y,x2,y2,64,32,5);else if(mode==1)lines.kamAjak(x,y,x2,y2,64,32,5);else lines.KamaJAk(x,y,x2,y2,64,32,5);
                long hash=0xcbf29ce484222325L;for(int p:surface.AMAjakk){hash^=p&0xffffffffL;hash*=0x100000001b3L;}d.writeLong(hash);
            }
        }
        MixerBus mixer=new MixerBus();ModuleLoader.kKAmAjA(Files.readAllBytes(repo.resolve("java-desktop/assets/data/rocket.xm"))).JakkAMa(mixer);
        var device=new muhmu.hifi.device.JavaSoundDevice(true);device.init(mixer,22050,4,22050,null);int[] audio=new int[1024];
        try(var pcm=new BufferedOutputStream(Files.newOutputStream(out.resolve("music.pcm")))){
            for(int b=0;b<4092;b++){device.bufferStartTime=4_000_000_000_000L+b*1024000L/22050;Arrays.fill(audio,0);mixer.mix(device,audio,0,1024);for(int p:audio)for(int shift=0;shift<32;shift+=8)pcm.write(p>>>shift);}
        }
        System.out.println("Exported 72 scene frames, 39 image buffers and 480 line cases and 4092 XM blocks.");System.exit(0);
    }
}
