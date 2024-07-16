package com.SpringSec.SpringSecPractice.SessionController;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller_SessionID {

    //we use session id for change id with form login spring security
    @GetMapping("/rest")
    public String getSessionID(HttpServletRequest request){
      return "Hello Sokphorn" + request.getSession().getId();
    }
//    @GetMapping("/rest")
//    public String getSessionID(){
//        return "Hello Sokphorn";
//    }

}
