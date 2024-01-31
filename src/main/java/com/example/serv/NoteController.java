package com.example.serv;

//import org.aspectj.weaver.ast.Not;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/note")
public class NoteController {
    private static final Logger logger= LogManager.getLogger(ServApplication.class);
    @GetMapping("/test")
    public String testEndpoint(){
        return "hello word!!";
    }
    @GetMapping("/loguseragent")
    public String logtest(@RequestHeader("User-Agent") String useragent){
        System.out.println(useragent);
        logger.info("User-Agent "+" "+useragent);
        return "logtest";
    }


}
