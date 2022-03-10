--================================
-- 用户
-- 用户表
create table bbs_user
(
    id          int primary key auto_increment,
    -- 用户名(varchar的unique key大小写不敏感，如果有敏感需要请替换类型为varchar binary)
    username    varchar(50)  unique not null,
    -- 昵称
    nickname    varchar(50)  default "",
    -- 头像
    avatar      varchar(255) default "",
    -- 密码
    password    varchar(255) default "",
    -- 手机号
    mobile      varchar(20)  default "",
    -- 邮箱
    email       varchar(255) default "",
    -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
);


-- 用户关注
create table bbs_user_attention(
    id int primary key auto_increment,
    -- 关注者ID
    user_id int default 0,
    -- 被关注者ID
    user_attention_id int default 0 comment '被关注者ID',
   -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
);


--===========================================
-- 帖子
create table bbs_post
(
    id          int primary key auto_increment,
    -- 标题
    title       varchar(255) default "",
    -- 概要
    description varchar(255) default "",
    -- 正文内容，最多65535字
    content     text, 
    -- 标签
    tag_id int default 0,
    --类型（版块）
    type_id int default 0,
    --浏览数
    View int default 0,
    --点赞数
    Like int default 0,
    --收藏数
    Collect int default 0,
    -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
);
-- 类型（版块）
create table bbs_post_type
(
    id          int primary key auto_increment,
    typename        varchar(255) default "",
    -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
);
--视频
create table bbs_video
(
    id          int primary key auto_increment,
    -- 标题
    title       varchar(255) default "",
    --修改后标题
    Alter_title varchar(255) default "",
    -- 描述
    description varchar(255) default "",
    -- 视频路径
    path   String default "", 
    -- 标签
    tag_id int  default 0,
    --类型（版块）
    type_id int  default 0,
    --浏览数
    View int  default 0,
    --点赞数
    Like int  default 0,
    --收藏数
    Collect int  default 0,
    --文件大小
    Size varchar(255) default "",
    --文件类型
    type varchar(255) default "",
    -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
);



-- 标签
create table bbs_post_tag
(
    id          int primary key auto_increment,
    tagname        varchar(255) default "",
    -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
);

-- =======================================================
-- 权限管理
-- 用户对应的角色
create table bbs_user_role
(
    id          int primary key auto_increment,
    user_id     int,
    role_id     int,
    -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
    deleted     bool         default false
);


-- 角色
create table bbs_role
(
    id          int primary key auto_increment,
    -- 角色名称
    name        varchar(50),
    -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
);


-- 角色所对应的权限
create table bbs_role_permission
(
    id            int primary key auto_increment,
    role_id       int,
    permission_id int,
    -- 必要字段
    update_time   datetime     default "2021-10-01 12:00:00",
    create_time   datetime     default "2021-10-01 12:00:00",
    create_id     int          default 0,
    update_id     int          default 0,
);


-- 权限
create table bbs_permission
(
    id          int primary key auto_increment,
    -- 权限名称
    name        varchar(50),
    -- 权限英文名 eg: post:get 查看文章
    enname      varchar(50),
    -- 请求地址
    url         varchar(255),
    sort        int,
    -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
);


-- ==============================
-- im
-- 消息
create table bbs_im_notification(
    id int primary key auto_increment,
    sender_id int,
    receiver_id int,
    -- 正文内容，最多65535字
    content text,
    -- 是否已读
    have_read bool,
    -- 消息类型
    type tinyint,
   -- 必要字段
   update_time datetime     default "2021-10-01 12:00:00",
   create_time datetime     default "2021-10-01 12:00:00",
   create_id   int          default 0,
   update_id   int          default 0,
);


-- 回复
create table bbs_comment
(
    id          int primary key auto_increment,
    -- 正文内容
    content     text,
    -- 父级回复内容
    parent_id   int          default 0,
    -- 回复所在帖子ID
    post_id     int          default 0,
    --点赞数
    like int                 default 0,
    -- 必要字段
    update_time datetime     default "2021-10-01 12:00:00",
    create_time datetime     default "2021-10-01 12:00:00",
    create_id   int          default 0,
    update_id   int          default 0,
);
