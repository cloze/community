package com.gameclub.community.mapper;

import com.gameclub.community.po.Post;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {
    @Insert("insert into (postUserId,title,postTypeId,content,createTime,viewNum,commentNum,hotNum,likeNum) " +
            "values(#{postUserId},#{title},#{postTypeId},#{content},#{createTime},#{viewNum},#{commentNum},#{hotNum},#{likeNum}")
    void create(Post post);

}
