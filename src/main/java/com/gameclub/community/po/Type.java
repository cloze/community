package com.gameclub.community.po;

import java.util.Date;

/**
 * @ClassName Type
 * @Description TODO
 * @Author YCDN
 * @Date 2022/3/8 21:06
 * @Version 1.0
 */
public class Type {
    private String typeName;//类型
    private Date createTime;//时间

    public Type() {
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
