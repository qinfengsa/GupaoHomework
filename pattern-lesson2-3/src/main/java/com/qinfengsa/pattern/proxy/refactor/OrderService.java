package com.qinfengsa.pattern.proxy.refactor;

import java.util.Map;

/**
 * @author: qinfengsa
 * @date: 2019/3/17 23:12
 */
public interface OrderService {

    /**
     * 导出订单Excel
     * @param params
     * @throws Exception
     */
    void exportOrder(Map<String,Object> params) throws Exception;
}
