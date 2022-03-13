package com.gameclub.community.service.impl;

import com.gameclub.community.entity.BbsPost;
import com.gameclub.community.mapper.BbsPostMapper;
import com.gameclub.community.service.BbsPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gameclub.community.utlis.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JWT
 * @since 2022-03-12
 */
@Service
public class BbsPostServiceImpl extends ServiceImpl<BbsPostMapper, BbsPost> implements BbsPostService {
    @Autowired
    private BbsPostMapper bbsPostMapper;

    @Override
    public String insertNewPost(String title, String content, HttpServletRequest request) {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("success","false");
        //首先要从request里面尝试取出用户id，获取用户登录状态
        Integer uid = TokenUtils.getUid(request);
        if(uid != null) {
            //数据合法性检验
            if(title != null && title.length() < 99 && content != null) {
                //这三个用不上，直接设置null
                BbsPost newPost = new BbsPost(0, title, content, uid, null,null,null);
                if(bbsPostMapper.insertNewPost(newPost) == 1) {
                    resultMap.put("success","true");
                }
            }
        }
        return null;
    }

    @Override
    public String getSomePostNew(int pageIndex, HttpServletRequest request) {
        return null;
    }

    @Override
    public String updatePost(Integer postId, String newTitle, String newContent, HttpServletRequest request) {
        return null;
    }

    @Override
    public String getPostCollectedBy(Integer collectId) {
        return null;
    }

    @Override
    public String deletePost(Integer postId, HttpServletRequest request) {
        return null;
    }
}
