package com.swak.demo.dao.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 菜单权限表
 * </p>
 *
 * @author ljq
 * @since 2024-10-27
 */
@Getter
@Setter
@TableName("sys_menu")
@ApiModel(value = "SysMenuDo对象", description = "菜单权限表")
public class SysMenuDo {

    @ApiModelProperty("菜单ID")
    @TableId(value = "menu_id", type = IdType.AUTO)
    private Long menuId;

    @ApiModelProperty("菜单名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("英文名称")
    @TableField("en_name")
    private String enName;

    @ApiModelProperty("权限标识")
    @TableField("permission")
    private String permission;

    @ApiModelProperty("路由路径")
    @TableField("`path`")
    private String path;

    @ApiModelProperty("父菜单ID")
    @TableField("parent_id")
    private Long parentId;

    @ApiModelProperty("菜单图标")
    @TableField("icon")
    private String icon;

    @ApiModelProperty("是否可见，0隐藏，1显示")
    @TableField("`visible`")
    private String visible;

    @ApiModelProperty("排序值，越小越靠前")
    @TableField("sort_order")
    private Integer sortOrder;

    @ApiModelProperty("是否缓存，0否，1是")
    @TableField("keep_alive")
    private String keepAlive;

    @ApiModelProperty("是否内嵌，0否，1是")
    @TableField("embedded")
    private String embedded;

    @ApiModelProperty("菜单类型，0目录，1菜单，2按钮")
    @TableField("menu_type")
    private String menuType;

    @ApiModelProperty("创建人")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty("修改人")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty("删除标志，0未删除，1已删除")
    @TableField("del_flag")
    private String delFlag;
}
