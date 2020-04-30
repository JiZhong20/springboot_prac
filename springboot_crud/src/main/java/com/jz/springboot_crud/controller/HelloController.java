package com.jz.springboot_crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @param
 * @description
 * @Created by IntelliJ IDEA.
 * @author:
 * @Date: 2020/4/16
 * @return
 */
@Controller
public class HelloController {

//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "index";
//    }
@RequestMapping("/hello")
    public String hello(){

    return "hello springboot world !";
}
@RequestMapping("/success")
    public String success(Map<String,Object> map){
    map.put("hello","你好");
    return "success";
    }
}
