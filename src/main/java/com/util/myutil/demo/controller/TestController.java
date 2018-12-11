package com.util.myutil.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TestController
 * @Author hello
 * @Date 2018/12/11 22:45
 **/
@ResponseBody
@Controller
public class TestController {



    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }


}
