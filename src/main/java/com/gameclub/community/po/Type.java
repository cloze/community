package com.gameclub.community.po;

/**
 * @ClassName Type
 * @Description 类型
 * @Author YCDN
 * @Date 2022/3/8 21:06
 * @Version 1.0
 */
public class Type {
    //TODO:2022/03/09 注释
    private int id;
    /**
     *类型名
     */
    private String typeName;

    public Type() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
