package com.gameclub.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName PostController
 * @Description TODO
 * @Author YCDN
 * @Date 2022/3/5 21:32
 * @Version 1.0
 */
@Controller
public class PostController {
    @GetMapping("/post")
    public String post(){
        return "post";
    }
}
