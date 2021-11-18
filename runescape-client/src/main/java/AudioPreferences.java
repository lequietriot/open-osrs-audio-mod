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

    public static String SAMPLE_INDEX = "Index = ";
    public static String SAMPLE_NAME = "Sample = ";
    public static String LOOP_MODE = "Loop Mode = ";
    public static String SAMPLE_ROOT_KEY = "Root Key = ";
    public static String SAMPLE_KEY_INDEX = "Sample Key = ";
    public static String MASTER_VOLUME = "Patch Volume = ";
    public static String SAMPLE_VOLUME = "Sample Volume = ";
    public static String SAMPLE_PAN = "Sample Pan = ";

    public static String PARAMETER_1 = "Parameter 1 = ";
    public static String PARAMETER_2 = "Parameter 2 = ";
    public static String PARAMETER_3 = "Parameter 3 = ";
    public static String PARAMETER_4 = "Parameter 4 = ";
    public static String PARAMETER_5 = "Parameter 5 = ";
    public static String PARAMETER_6 = "Parameter 6 = ";
    public static String PARAMETER_7 = "Parameter 7 = ";

    public static String ARRAY_1 = "Array 1 = ";
    public static String ARRAY_2 = "Array 2 = ";

    static {
        customResourceFolder = new File("runescape-client/src/test/resources/audio").getAbsolutePath();

        /**
        if (new File("runescape-client/src/test/resources/audio/output").mkdirs()) {

        }
         **/
        musicSaveFile = new File("runescape-client/src/test/resources/audio/output").getAbsolutePath();
    }
}
