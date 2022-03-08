package com.gameclub.community.po;


import javax.persistence.*;
import java.sql.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Author YCDN
 * @Date 2022/3/1 21:31
 * @Version 1.0
 */
public class User {
    private int id;
    private String nickname;
    private String password;
    private String email;
    private String phone;
    private String avatar;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyTime;

    public User() {
    }

    public User(int id, String nickname, String password, String email, String phone, String avatar, Date createTime, Date modifyTime) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
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

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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
                ", modifyTime=" + modifyTime +
                '}';
    }
}