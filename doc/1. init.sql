ALTER DATABASE `swak_demo` CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

# 再一个开源的pig中获取的表用来测试
CREATE TABLE `sys_dept`
(
    `dept_id`     bigint      NOT NULL COMMENT '部门ID',
    `name`        varchar(50)          DEFAULT NULL COMMENT '部门名称',
    `sort_order`  int         NOT NULL DEFAULT '0' COMMENT '排序',
    `create_by`   varchar(64) NOT NULL DEFAULT ' ' COMMENT '创建人',
    `update_by`   varchar(64) NOT NULL DEFAULT ' ' COMMENT '修改人',
    `create_time` datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time` datetime             DEFAULT NULL COMMENT '修改时间',
    `del_flag`    char(1)              DEFAULT '0' COMMENT '删除标志',
    `parent_id`   bigint               DEFAULT NULL COMMENT '父级部门ID',
    PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT ='部门管理';