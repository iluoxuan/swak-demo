# 小项目工程化探讨

## 结构划分

### api层

* 只依赖基础的swak-client包；swak-client包依赖也比较少基本都是lombok，swagger注解，jackson注解，bean验证注解

### dao层

* 使用mybatis-plus的 依赖swak-mybatis-plus
* 依赖demo-api; 为了把某些请求对象传递到dao
* 如果是单表操作; 建议定义清楚接口方法，再default中写查询 -- 不要溢出到service层

```java

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
}
```

* 如果是连表操作，或者复杂的sql，配置mybatisX 写到xml文件中
* 生成代码： MybatisGen ，已经禁用了生成service ，controller

### service层

* 引入swak-common: 提供了相关所需要的包，文档，验证
* web层全局异常 继承 AbstractExceptionHandler 打上注解
* knife4j 接口文档配置yml即可
* 统一了jackson使用,常见的问题