package com.swak.demo.api.base;

import com.swak.lib.client.exception.SwakError;
import lombok.AllArgsConstructor;

/**
 * @author: ljq
 * @date: 2024/10/27
 */
@AllArgsConstructor
public enum SwakDemoError implements SwakError {

    DEPT_ID_ERROR("A2000", "门店ID与名称不匹配"),

    ;

    private String code;
    private String msg;


    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
