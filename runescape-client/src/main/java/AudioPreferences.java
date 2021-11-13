import java.io.File;

public class AudioPreferences {

    public static int sampleRate = 44100;
    public static boolean stereoSound = true;
    
    public static boolean useCustomResources = true;
    public static String customResourceFolder;

    static {
        customResourceFolder = new File("runescape-client/src/test/resources/audio").getAbsoluteFile().getPath();
    }
}
