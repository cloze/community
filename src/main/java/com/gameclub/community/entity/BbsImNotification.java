package com.gameclub.community.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class BbsImNotification implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer senderId;

    private Integer receiverId;

    private String content;

    private Boolean haveRead;

    private Integer type;

    private Date updateTime;

    private Date createTime;

    private Integer createId;

    private Integer updateId;


}
