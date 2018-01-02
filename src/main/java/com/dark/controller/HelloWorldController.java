package com.dark.controller;

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
    @RequestMapping("/world")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
