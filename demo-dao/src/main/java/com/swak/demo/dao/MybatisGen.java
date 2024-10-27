package com.swak.demo.dao;

import com.swak.lib.dao.mybatis.plus.gen.GenInfo;
import com.swak.lib.dao.mybatis.plus.gen.MybatisPlusBaseGen;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: ljq
 * @date: 2024/10/26
 */
@Slf4j
public class MybatisGen extends MybatisPlusBaseGen {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/swak_demo";
        GenInfo genInfo = new GenInfo();
        genInfo.setAuthor("ljq");
        genInfo.setUserName("root");
        genInfo.setPassword("123456");
        genInfo.setJdbcUrl(url);
        genInfo.setModelName("demo-dao");
        genInfo.setPackageName("com.swak.demo.dao");
        genInfo.setGenTableName("sys_dept");
        new MybatisGen().gen(genInfo);

    }
}
