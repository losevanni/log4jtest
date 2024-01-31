package com.example.serv;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ServApplication {
	private static final Logger logger= LogManager.getLogger(ServApplication.class);
//private static final Logger logger= LogManager.getLogger("com.example.serv.ServApplication");

	public static void main(String[] args) {
		SpringApplication.run(ServApplication.class, args);
//		logger.debug("debug");
		logger.info("info");
		logger.info("START Log4j Shell Test");
//		logger.warn("warn");
//		logger.error("error");
	}
}
