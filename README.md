# 小项目工程化探讨

## 代码结构划分
### api 层
* api提供远程调用api或者http feign调用的api
* 有的公司支持服务注册，有的直接http看使用场景
* 尽量确保只是依赖注解等简单东西    
### dao 层
* dao实现层，一般的公司mybatis-plus实现层，
* dao的操作不要溢出到service，禁用mybatis-plus的iServer，版本可以使用3.5.4之后basemapper
* 单表简单的sql，直接在接口层使用default实现
* 复杂的sql，比如连接表 配置mybatisx插件，写到xml文件中
* dao层使用代码生成, 确保不使用mysql关键字
* 封装好分页转换操作
* 当然还有其他的比如 es, 其他库的也放这里

### service层
* 合理的面向接口编程，去掉毫无意义的接口service
* 合理拆分service层逻辑，
* 按业务分包
* service模块中有一层service包，可以加一层manager包
* manager主要做dao聚合，mq操作，cache操作，业务逻辑复用的，但是一般情况取名也叫service
* 业务复杂的模块独立划分包，拆不同的service等看自己。
* 禁用在service层中动态操作sql，所有的sql操作必须放dao层。
### web层 有的可能会有web层
* 比如管理后天有web层 直接放service也可以
* 如果纯api就可能没有了

## 关于数据传输对象
* DO dao成生产的表对象 ，如果业务简单可以直接返回给前端，前期赶时间可以使用crud效率很高
* 请求和返回对象，统一命名 req/res结尾，禁用使用dto，又做请求参数又做返回的对象分不清
* 中间对象比如mq等操作看自己喜欢，建议可以加上Bo结尾
* 传输参数超过两个，使用req对象，

## 关于业务系统验证数据权限等控制
* 把需要控制的数据字典通过header传输
* 在代码层面使用切面进行拦截 自定义注解
* 登录用户相关的数据 放上下文对象中# swak-demo
