package com.qinfengsa.pattern.strategy.refactor;

import com.qinfengsa.pattern.entity.Order;

/**
 * @author: qinfengsa
 * @date: 2019/3/17 23:12
 */
public interface OrderService {

    /**
     * 工单完成，根据来源类型通知不同的业务方
     * @param order
     * @throws Exception
     */
    void finishOrder(Order order) throws Exception;
}
