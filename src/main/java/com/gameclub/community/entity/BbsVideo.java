package com.gameclub.community.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author JWT
 * @since 2022-03-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BbsVideo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    @TableField("Alter_title")
    private String alterTitle;

    private String description;

    private String path;

    private Integer tagId;

    private Integer typeId;

    private Integer viewCount;

    private Integer likeCount;

    private Integer collectCount;

    private String videoSize;

    private String type;

    private Date updateTime;

    private Date createTime;

    private Integer createId;

    private Integer updateId;


}
