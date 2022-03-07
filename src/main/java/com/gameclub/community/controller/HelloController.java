package com.gameclub.community.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName helloController
 * @Description TODO
 * @Author YCDN
 * @Date 2022/2/27 22:11
 * @Version 1.0
 */
@RestController
public class HelloController {

    /**
     * sayHello
     * @return
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
