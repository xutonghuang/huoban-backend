-- auto-generated definition
create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    username     varchar(256)                       null comment '用户昵称',
    userAccount  varchar(256)                       null comment '账号',
    avatarUrl    varchar(1024)                      null comment '用户头像',
    gender       tinyint                            null comment '性别',
    userPassword varchar(512)                       not null comment '密码',
    phone        varchar(128)                       null comment '手机号',
    email        varchar(512)                       null comment '邮箱',
    userStatus   int      default 0                 not null comment '状态 0 - 正常',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null comment '更新时间',
    isDelete     tinyint  default 0                 null comment '是否删除',
    userRole     int      default 0                 not null comment '用户角色 0 - 普通用户 1 - 管理员',
    tags         varchar(1024)                      null comment '标签 json 列表'
)
    comment '用户';


create table if not exists tag
(
    id           bigint auto_increment comment 'id' primary key,
    tagName      varchar(256)                       null comment '标签名称',
    userId       bigint                             null comment '用户 id',
    parentId     bigint                             null comment '父标签 id',
    isParent     tinyint                            null comment '0 - 不是, 1 - 父标签',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null comment '更新时间',
    isDelete     tinyint default 0                  null comment '是否删除',
    constraint unildx_tagName unique (tagName)
)
    comment '标签';

create index idx_userId
    on huoban.tag (userId);

