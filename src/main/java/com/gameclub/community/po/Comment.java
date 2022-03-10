package com.gameclub.community.po;


import java.util.Date;

/**
 * @ClassName Comment
 * @Description 评论
 * @Author YCDN
 * @Date 2022/3/8 21:01
 * @Version 1.0
 */
public class Comment {
    private int id;
    /**
     * 回复内容
     */
    private String content;
    /**
     * 回复的帖子
     */
    private int postId;
    /**
     * 评论时间
     */
    private Date comTime;
    /**
     * 修改时间，也可存放删除时间
     */
    private Date updateTime;
    /**
     * 点赞数
     */
    private int likeNum;
    /**
     * 回复的用户
     */
    private int userId;


    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
