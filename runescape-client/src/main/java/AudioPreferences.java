/*
 * Audio Preferences class
 * Custom settings class that allows for custom resources and modifications
 * @author Rodolfo Ruiz-Velasco (https://github.com/lequietriot)
 */
import java.io.File;

public class AudioPreferences {

    public static int sampleRate = 44100;
    public static boolean stereoSound = true;
    
    public static boolean useCustomResources = true;
    public static boolean writeMusicToFile = false;
    public static String customResourceFolder;
    public static String musicSaveFile;

    static {
        customResourceFolder = new File("runescape-client/src/test/resources/audio").getAbsolutePath();

        /**
        if (new File("runescape-client/src/test/resources/audio/output").mkdirs()) {

        }
         **/
        musicSaveFile = new File("runescape-client/src/test/resources/audio/output").getAbsolutePath();
    }
}
