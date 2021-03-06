package monitor;

/**
 * Class with static method for printing logs of device
 * @author Jarosław Nogała
 */
public class Log {
    private static String Monitor = "Monitor";
            
    /**
     * Method for printing logs of application with specified TAG
     * @param TAG
     *          the preambule of log
     * @param text 
     *          the message of log
     */
    
    private static String textFormat = "%20s : %s\n";
    
    public static void i(String TAG, String text){
        System.out.printf(textFormat, TAG, text);
    }
    
    /*
     * Method for printing logs of application whith "Monitor" preambule
     */
    public static void i(String text){
        Log.i(Log.Monitor, text);
    }
}
