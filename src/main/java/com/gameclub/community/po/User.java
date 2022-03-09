package com.gameclub.community.po;


import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName User
 * @Description 用户
 * @Author YCDN
 * @Date 2022/3/1 21:31
 * @Version 1.0
 */
public class User {
    private int id;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;


    public User() {
    }

    public User(int id, String nickname, String password, String email, String phone, String avatar, Date createTime) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
        this.createTime = createTime;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
