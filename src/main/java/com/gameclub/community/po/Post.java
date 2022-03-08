package com.gameclub.community.po;

import java.sql.Date;

/**
 * @ClassName Post
 * @Description TODO
 * @Author YCDN
 * @Date 2022/3/5 15:35
 * @Version 1.0
 */
public class Post {

    // TODO: 2022/3/7 注释都加下
    private int id;

    /**
     * post user id
     */
    private int postAuthor;//发帖者
    private String title;//标题
    private int postTypeId;//帖子类型
    private int tagId;//标签类型
    private String content;//正文
    private String image;//图片
    private int commentId;//评论者
    private Date createTime;//创建时间
    private Date updateTime;//更新时间
    private int viewNum;//浏览数
    private int commentNum;//评论数
    private int likeNum;//点赞数
    private int collectNum;//收藏数

    public Post() {
    }

    public int getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(int postAuthor) {
        this.postAuthor = postAuthor;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(int collectNum) {
        this.collectNum = collectNum;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPostTypeId() {
        return postTypeId;
    }

    public void setPostTypeId(int postTypeId) {
        this.postTypeId = postTypeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getViewNum() {
        return viewNum;
    }

    public void setViewNum(int viewNum) {
        this.viewNum = viewNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }
}
