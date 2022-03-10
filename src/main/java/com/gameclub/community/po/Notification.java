package com.gameclub.community.po;

import java.util.Date;

/**
 * @ClassName Notification
 * @Description 通知
 * @Author YCDN
 * @Date 2022/3/8 21:13
 * @Version 1.0
 */
public class Notification {
    private int id;
    /**
     * 发消息的人
     */
    private int senderId;
    /**
     * 收到的人
     */
    private int receiverId;
    /**
     * 内容
     */
    private String content;
    /**
     * 发送时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    public Notification() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
