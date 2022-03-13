package com.gameclub.community.mapper;

import com.gameclub.community.entity.BbsPost;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gameclub.community.entity.BbsUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author JWT
 * @since 2022-03-12
 */
@Repository
public interface BbsPostMapper extends BaseMapper<BbsPost> {
    int insertNewPost(BbsPost bbsPost);

    List<String> getAllPostContent();

    List<BbsPost> getSomePostNew(@Param("startAt") Integer startAt, @Param("howMany") Integer howMany);

    List<BbsUser> getAuthorOf(Integer postId);

    int getCollectionCount(Integer postId);

    int getLikeCount(Integer postId);

    int getCommentCount(Integer postId);

    int getAllPostCount();

    int getPostCountWriteBy(Integer authorId);

    List<BbsPost> getPostById(Integer postId);

    int beBrowsed(Integer postId);

    List<BbsPost> getPostWriteBy(Integer authorId);

    int updateArticle(@Param("postId") Integer postId,
                      @Param("newTitle") String newTitle,
                      @Param("newContent") String newContent);

    int deleteArticleAndAssociations(Integer postId);

    List<BbsPost> getArticlesCollectedBy(Integer collector);

    List<String> getAuthorNicknameByArticleId(Integer postId);

    List<Map<String, Object>> searchArticleInNaturalLanguageMode(String searchVal);
}
