package com.gameclub.community.controller;


import com.gameclub.community.common.lang.Result;
import com.gameclub.community.po.Post;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JWT
 * @since 2022-03-12
 */
@RestController
public class BbsPostController {

    /**
     * 首页列表
     * @param currentPage
     * @return
     */
    @GetMapping("/index")
    public Result list(@RequestParam(defaultValue = "1")Integer currentPage){

        return Result.succ(null);
    }
    /**
     * 帖子内容
     * @param id
     * @return
     */
    @GetMapping("/index/{id}")
    public Result detail(@PathVariable(name = "id")Integer id){

        return Result.succ(null);
    }

    @GetMapping("/page-create-topic")
    public Result edit(@Validated @RequestBody Post post){

        return Result.succ(null);
    }
}

