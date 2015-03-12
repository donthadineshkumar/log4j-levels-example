package com.struts.log.pack2;

import org.apache.log4j.Logger;

import com.struts.log.pack3.LoggerR;

public class Logger2 {
	
	private static Logger logger2 = Logger.getLogger(Logger2.class.getName());
	
	public static void main(String ...a){
		
		logger2.debug("debug message from Logger2");
		logger2.info("Info Message from Logger2");
		logger2.warn("WARN Message from Logger2");
		logger2.error("Error Message: from Logger2");
		logger2.fatal("Fatal Messgae from Logger2");
	}


}
