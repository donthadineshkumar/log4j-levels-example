package com.struts.log.pack1;

import org.apache.log4j.Logger;


public class Logger1 {
	
	private static Logger logger1 = Logger.getLogger(Logger1.class.getName());
	
	public static void main(String ...a){
		
		logger1.debug("debug message from logger1");
		logger1.info("Info Message from logger1");
		logger1.warn("WARN Message from logger1");
		logger1.error("Error Message: from logger1");
		logger1.fatal("Fatal Messgae from logger1");
	}

}
