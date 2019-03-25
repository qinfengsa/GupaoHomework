package com.qinfengsa.pattern.prototype.homework;

/**
 * @author: qinfengsa
 * @date: 2019/3/17 23:12
 */
public interface OrderService {

    /**
     * 根据远程调用的JSON字符串生成工单
     * @param json
     * @throws Exception
     */
    void createOrderByJson(String json) throws Exception;
}
