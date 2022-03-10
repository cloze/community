package com.gameclub.community.po;

/**
 * @ClassName Tag
 * @Description 标签
 * @Author YCDN
 * @Date 2022/3/8 21:07
 * @Version 1.0
 */
public class Tag {
    //TODO:2022/03/09 注释
    private int id;
    /**
     * 标签名
     */
    private String tagName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tag() {
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
