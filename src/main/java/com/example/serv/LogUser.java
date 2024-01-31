package com.example.serv;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestHeader;
import com.example.serv.LogUser;

public class LogUser {

//    private  static final Logger logger= LogManager.getLogger(LogUser.class);
    public static String LogUserAgent(String useragent){
//        logger.info("User-Agent = "+ useragent);
        return useragent;
    }
}
