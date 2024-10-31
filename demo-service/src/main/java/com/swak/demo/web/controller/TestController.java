package com.swak.demo.web.controller;

import com.swak.demo.api.entity.DeptPageReq;
import com.swak.demo.dao.domain.SysDeptDo;
import com.swak.demo.entity.test.TestDataReq;
import com.swak.demo.service.DeptService;
import com.swak.lib.client.entity.ApiRes;
import com.swak.lib.client.entity.PageRes;
import com.swak.lib.common.annotion.LogTrace;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

/**
 * @author: ljq
 * @date: 2024/10/24
 */
@LogTrace
@Api("测试")
@AllArgsConstructor
@RequestMapping("/test")
@RestController
public class TestController {


    private final DeptService deptService;

    @GetMapping("/testApi")
    public ApiRes<SysDeptDo> testApi(@RequestParam("name") String name) {
        return ApiRes.success(deptService.getDept(name));
    }

    @ApiOperation("分页查询")
    @PostMapping("/testPage")
    public ApiRes<PageRes<SysDeptDo>> pageApi(@Valid @RequestBody DeptPageReq req) {


        return ApiRes.success(deptService.pageList(req));
    }

    @ApiOperation("事务测试")
    @PostMapping("/tran")
    public ApiRes<Void> tran() {
        deptService.testTran();
        return ApiRes.success();
    }


    @GetMapping("/batchInsert")
    public ApiRes<SysDeptDo> batchInsert() {
        return ApiRes.success(deptService.batchInsert());
    }

    @PostMapping("/testDate")
    public ApiRes<Void> testDate(@Valid @RequestBody TestDataReq req) {
        deptService.testDate(req);
        return ApiRes.success();
    }

    @PostMapping("/testDateFrom")
    public ApiRes<Void> testDateForm(@RequestParam("date") Date date) {
        TestDataReq req = new TestDataReq();
        req.setStartDate(date);
        deptService.testDate(req);
        return ApiRes.success();
    }
}
