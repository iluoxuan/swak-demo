package com.swak.demo.manager.rpc;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 外部请求接口
 * 1. 如何更好的调用外部http接口
 * <p>
 * httpclient
 * okhttp
 * --- 再上面的基础上封装的restTemplate
 * <p>
 * 如果你再的部门有很多的第三方请求，那么需要将不同的第三方调用独立jar包，方便引用
 * 1. 如果使用的如nacos的配置中，第三方请求的url等公用一个配置
 * 2. 如果是自研的 按自研的接入
 * <p>
 * 3. 如果不需要特别定制化 可以使用openFeign调用
 *
 * @author: ljq
 * @date: 2024/10/27
 */
@AllArgsConstructor
@Service
public class WeixRpcManager {


}
