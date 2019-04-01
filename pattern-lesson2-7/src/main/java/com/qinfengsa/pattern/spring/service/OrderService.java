package com.qinfengsa.pattern.spring.service;

import java.util.Map;

/**
 * 订单接口
 * @author: qinfengsa
 * @Date: 2019/3/17 23:12
 */
public interface OrderService {

    /**
     * 导出订单Excel
     * @param params
     * @throws Exception
     */
    void exportOrder(Map<String, Object> params) throws Exception;
}
