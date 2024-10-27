package com.swak.demo.dao.domain;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * <p>
 * 部门管理
 * </p>
 *
 * @author ljq
 * @since 2024-10-26
 */
@Getter
@Setter
@TableName("sys_dept")
@ApiModel(value = "SysDeptDo对象", description = "部门管理")
public class SysDeptDo {

    @ApiModelProperty("部门ID")
    @TableId(value = "dept_id", type = IdType.AUTO)
    private Long deptId;

    @ApiModelProperty("部门名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("排序")
    @TableField("sort_order")
    private Integer sortOrder;

    @ApiModelProperty("创建人")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("修改人")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty("修改时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty("删除标志")
    @TableField("del_flag")
    private String delFlag;

    @ApiModelProperty("父级部门ID")
    @TableField("parent_id")
    private Long parentId;
}
