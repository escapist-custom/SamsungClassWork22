package com.samsung;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static Logger logger;

    public static void main(String[] args) {
        logger = Logger.getLogger(App.class.getName());
        
        logger.log(Level.WARNING, "Start of the app");
        
        //...

        logger.log(Level.WARNING, "End of the app");
    }
}