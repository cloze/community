package com.gameclub.community.po;

import java.util.Date;

/**
 * @ClassName Tag
 * @Description TODO
 * @Author YCDN
 * @Date 2022/3/8 21:07
 * @Version 1.0
 */
public class Tag {
    private String tagName;//标签
    private Date createTime;//时间

    public Tag() {
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
