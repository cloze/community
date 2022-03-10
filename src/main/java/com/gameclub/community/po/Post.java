package com.gameclub.community.po;

import java.util.Date;
import java.util.List;

/**
 * @ClassName Post
 * @Description 帖子
 * @Author YCDN
 * @Date 2022/3/5 15:35
 * @Version 1.0
 */
public class Post {

    // TODO: 2022/3/7 注释都加下
    private int id;
    /**
     * 发帖者
     */
    private int postAuthor;
    /**
     * 标题
     */
    private String title;
    /**
     * 帖子类型（版块）
     */
    private int postTypeId;
    /**
     * 标签类型
     */
    private List<Integer> tagId;
    /**
     * 正文
     */
    private String content;
    /**
     * 评论信息，评论中包含评论者等信息
     */
    private List<Comment> comments;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 浏览数
     */
    private int viewNum;
    /**
     * 评论数
     */
    private int commentNum;
    /**
     * 点赞数
     */
    private int likeNum;
    /**
     * 收藏数
     */
    private int collectNum;

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(int postAuthor) {
        this.postAuthor = postAuthor;
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

    public List<Integer> getTagId() {
        return tagId;
    }

    public void setTagId(List<Integer> tagId) {
        this.tagId = tagId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public int getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(int collectNum) {
        this.collectNum = collectNum;
    }
}
