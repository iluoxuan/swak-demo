package com.swak.demo.web.controller;

import com.swak.demo.api.entity.DeptPageReq;
import com.swak.demo.dao.domain.SysDeptDo;
import com.swak.demo.service.DeptService;
import com.swak.lib.client.entity.ApiRes;
import com.swak.lib.client.entity.PageRes;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author: ljq
 * @date: 2024/10/24
 */
@AllArgsConstructor
@RequestMapping("/test")
@RestController
public class TestController {


    private final DeptService deptService;

    @GetMapping("/testApi")
    public ApiRes<SysDeptDo> testApi(@RequestParam("name") String name) {
        return ApiRes.success(deptService.getDept(name));
    }

    @PostMapping("/testPage")
    public ApiRes<PageRes<SysDeptDo>> pageApi(@Valid @RequestBody DeptPageReq req) {
        return ApiRes.success(deptService.pageList(req));
    }

    @GetMapping("/batchInsert")
    public ApiRes<SysDeptDo> batchInsert() {
        return ApiRes.success(deptService.batchInsert());
    }
}
