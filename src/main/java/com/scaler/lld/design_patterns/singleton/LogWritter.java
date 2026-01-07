package com.scaler.lld.design_patterns.singleton;

public class LogWritter {
    //Egger Initialization
//    private static LogWritter INSTANCE = new LogWritter();

    // Lazy Initialization
    private static LogWritter INSTANCE = null;
   //Private Constructor
    private LogWritter(){}

    // Global access point
    public static LogWritter getINSTANCE(){

        /* this is called double check so the only one thread is blacked when object is null
         * */
        if(INSTANCE == null) {
            synchronized (LogWritter.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LogWritter();
                }
            }
        }
        return INSTANCE;
    }
        //Egger initalization
        //    public static LogWritter getINSTANCE(){
        //        return INSTANCE;
        //    }
}
