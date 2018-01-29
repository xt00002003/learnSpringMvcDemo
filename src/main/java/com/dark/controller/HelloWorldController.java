package com.dark.controller;

import com.dark.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述: spring mvc 第一个实例
 *
 * @author : <a href="mailto:xueteng@yinli56.com ">teng.xue</a>
 * @version : Ver 1.0
 * @date : 2018/1/2
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/world")
    @ResponseBody
    public String hello(){


        return "hello";
    }
}
