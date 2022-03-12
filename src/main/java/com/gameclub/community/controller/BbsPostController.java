package com.gameclub.community.controller;


import com.gameclub.community.common.lang.Result;
import com.gameclub.community.entity.BbsPost;
import com.gameclub.community.po.Post;
import com.gameclub.community.service.BbsPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JWT
 * @since 2022-03-12
 */
@RestController("/api/bbs/post")
public class BbsPostController {

    @Autowired
    private BbsPostService bbsPostService;

    /**
     * 添加新帖子
     * @param title
     * @param content
     * @param request
     * @return
     */
    @PostMapping("/newPost")
    public String insertNewArticle(@RequestParam("title") String title,
                                   @RequestParam("content") String content,
                                   HttpServletRequest request) {
        return bbsPostService.insertNewPost(title, content, request);
    }
    @PostMapping("/updatePost")
    public String updateArticle(@RequestParam("editId") String editId,
                                @RequestParam("newTitle") String newTitle,
                                @RequestParam("newContent") String newContent,
                                HttpServletRequest request) {
        return bbsPostService.updatePost(Integer.parseInt(editId), newTitle, newContent, request);
    }
    /**
     * 根据ID获取数据库中的数据
     * @param postId
     * @return
     */
    @GetMapping("/get/{postId}")
    public Result getPostByPostId(@PathVariable Integer postId){
        BbsPost byId = bbsPostService.getById(postId);
        return Result.succ(byId);
    }

    /**
     * 根据作者ID获取帖子
     * @param authorId
     * @return
     */
    @GetMapping("/get/{authorId}")
    public Result getPostByAuthorId(@PathVariable Integer authorId){
        BbsPost byId = bbsPostService.getById(authorId);
        return Result.succ(byId);
    }

    /**
     * 获取新帖子
     * @param pageIndex
     * @param request
     * @return
     */
    @GetMapping("/getSomeArticleNew")
    public String getSomeArticleNew(@RequestParam("pageIndex") String pageIndex,
                                    HttpServletRequest request) {
        try {
            int pageIndexInt = Integer.parseInt(pageIndex);
            return bbsPostService.getSomePostNew(pageIndexInt, request);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }



}

