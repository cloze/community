package com.gameclub.community.po;

/**
 * @ClassName Session
 * @Description 版块
 * @Author YCDN
 * @Date 2022/3/9 20:25
 * @Version 1.0
 */
public class Session {
    private int id;
    /**
     * 版块名字
     */
    private String sessionName;
    /**
     * 版块点击次数
     */
    private int clickCount;

    public Session() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }
}
