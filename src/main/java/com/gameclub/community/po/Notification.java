package com.gameclub.community.po;

import java.util.Date;

/**
 * @ClassName Notification
 * @Description TODO
 * @Author YCDN
 * @Date 2022/3/8 21:13
 * @Version 1.0
 */
public class Notification {
    private String commenter;//评论者
    private String comTargetName;//评论的帖子
    private String liker;//点赞者
    private String likeTargetName;//点赞的帖子
    private String collector;//收藏者
    private String colTargetName;//收藏的帖子
    private Date commentTime;//评论时间
    private Date likeTime;//点赞时间
    private Date collectTime;//收藏时间

    public Notification() {
    }

    public String getCommenter() {
        return commenter;
    }

    public void setCommenter(String commenter) {
        this.commenter = commenter;
    }

    public String getComTargetName() {
        return comTargetName;
    }

    public void setComTargetName(String comTargetName) {
        this.comTargetName = comTargetName;
    }

    public String getLiker() {
        return liker;
    }

    public void setLiker(String liker) {
        this.liker = liker;
    }

    public String getLikeTargetName() {
        return likeTargetName;
    }

    public void setLikeTargetName(String likeTargetName) {
        this.likeTargetName = likeTargetName;
    }

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    public String getColTargetName() {
        return colTargetName;
    }

    public void setColTargetName(String colTargetName) {
        this.colTargetName = colTargetName;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Date getLikeTime() {
        return likeTime;
    }

    public void setLikeTime(Date likeTime) {
        this.likeTime = likeTime;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}
