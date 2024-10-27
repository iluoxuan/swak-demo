package com.swak.demo.entity.test;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author: ljq
 * @date: 2024/10/27
 */
@Data
public class TestDataReq {

    @NotNull
    public Date startDate;
}
