package com.utility;
import org.apache.log4j.Logger;
public class Log {
	    //Initialize Log4j logs
	public static Logger Log=Logger.getLogger(Log.class.getName());
	//Need to create these methods 
	public static void Info(String message) {
		Log.info(message);
	}
	public static void Error(String message) {
		Log.error(message);
	}

}
