package com.swak.demo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.swak.demo.api.entity.DeptPageReq;
import com.swak.demo.dao.domain.SysDeptDo;
import com.swak.lib.dao.mybatis.plus.PageTools;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 部门管理 Mapper 接口
 * </p>
 *
 * @author ljq
 * @since 2024-10-26
 */
@Mapper
public interface SysDeptMapper extends BaseMapper<SysDeptDo> {

    /**
     * 建议所有的sql语句 写到接口中，不要溢出到service层
     *
     * @param name
     * @return
     */
    default SysDeptDo getByName(String name) {
        return selectOne(
                Wrappers.lambdaQuery(SysDeptDo.class).eq(SysDeptDo::getName, name)
        );
    }

    default Page<SysDeptDo> pageBy(DeptPageReq req) {
        Page<SysDeptDo> page = PageTools.toIpage(req);
        return selectPage(page, Wrappers.lambdaQuery(SysDeptDo.class));
    }
}
