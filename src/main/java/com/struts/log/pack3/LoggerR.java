package com.struts.log.pack3;

import org.apache.log4j.Logger;

public class LoggerR {
	
	private static Logger pack3Logger = Logger.getLogger(LoggerR.class.getName());
	
	public static void main(String ...a){
		
		pack3Logger.debug("debug message from LoggerR");
		pack3Logger.info("Info Message from LoggerR");
		pack3Logger.warn("WARN Message from LoggerR");
		pack3Logger.error("Error Message: from LoggerR");
		pack3Logger.fatal("Fatal Messgae from LoggerR");
	}

}
