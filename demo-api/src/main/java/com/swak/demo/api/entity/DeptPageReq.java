package com.swak.demo.api.entity;

import com.swak.lib.client.entity.PageReq;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author: ljq
 * @date: 2024/10/26
 */
@Data
public class DeptPageReq extends PageReq {


    @NotBlank
    private String deptName;
}
