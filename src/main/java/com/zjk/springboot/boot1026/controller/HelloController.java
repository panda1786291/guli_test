package com.zjk.springboot.boot1026.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:HelloController
 * @Description:
 * @Author:Zhou Jingkai
 * @Data:2022-01-10 01:12
 * @Version:1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("helloTest")
    public String helloTest(){
        return "hello";
    }
}
