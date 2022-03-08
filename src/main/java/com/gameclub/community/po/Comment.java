package com.gameclub.community.po;

import java.sql.Date;

/**
 * @ClassName Comment
 * @Description TODO
 * @Author YCDN
 * @Date 2022/3/8 21:01
 * @Version 1.0
 */
public class Comment {
    private String content;//回复内容
    private int postId;//帖子
    private int userId;//回复者
    private Date comTime;//评论时间
    private int likeNum;//点赞数
    private int dislikeNum;//
    private String image;//图片

    public Comment() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getComTime() {
        return comTime;
    }

    public void setComTime(Date comTime) {
        this.comTime = comTime;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public int getDislikeNum() {
        return dislikeNum;
    }

    public void setDislikeNum(int dislikeNum) {
        this.dislikeNum = dislikeNum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
