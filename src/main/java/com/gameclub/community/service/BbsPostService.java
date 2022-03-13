package com.gameclub.community.service;

import com.gameclub.community.entity.BbsPost;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author JWT
 * @since 2022-03-12
 */
public interface BbsPostService extends IService<BbsPost> {
    String insertNewPost(String title, String content, HttpServletRequest request);

    String getSomePostNew(int pageIndex, HttpServletRequest request);

    String updatePost(Integer postId, String newTitle, String newContent, HttpServletRequest request);

    String getPostCollectedBy(Integer collectId);

    String deletePost(Integer postId, HttpServletRequest request);


}
