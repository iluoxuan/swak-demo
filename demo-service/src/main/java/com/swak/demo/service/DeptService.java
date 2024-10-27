package com.swak.demo.service;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.swak.demo.api.entity.DeptPageReq;
import com.swak.demo.dao.domain.SysDeptDo;
import com.swak.demo.dao.mapper.SysDeptMapper;
import com.swak.lib.client.entity.PageRes;
import com.swak.lib.dao.mybatis.plus.PageTools;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author: ljq
 * @date: 2024/10/26
 */
@AllArgsConstructor
@Service
public class DeptService {

    private final SysDeptMapper sysDeptMapper;

    public SysDeptDo getDept(String name) {

        return sysDeptMapper.getByName(name);
    }

    public PageRes<SysDeptDo> pageList(DeptPageReq req) {

        Page<SysDeptDo> page = sysDeptMapper.pageBy(req);

        return PageTools.toPageRes(page);
    }

    public SysDeptDo batchInsert() {

        int i = 100;
        while (i > 0) {
            i--;
            SysDeptDo sysDeptDo = new SysDeptDo();
            sysDeptDo.setCreateTime(new Date());
            sysDeptDo.setUpdateTime(new Date());
            sysDeptDo.setName("ljq" + i);
            sysDeptDo.setDeptId(IdWorker.getId());
            sysDeptMapper.insert(sysDeptDo);
        }

        return null;

    }
}
