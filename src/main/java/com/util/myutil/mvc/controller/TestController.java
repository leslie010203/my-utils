package com.util.myutil.mvc.controller;

import com.util.myutil.jedisUtil.JedisUtil;
import com.util.myutil.jedisUtil.ObjectTranscoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.util.List;

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


    @RequestMapping("jedisTest")
    public String jedisTest(){
        JedisUtil jedisUtil = new JedisUtil();
        return jedisUtil.get("name");
    }

}
