package com.qinfengsa.pattern.strategy.refactor;

import com.qinfengsa.pattern.entity.Order;

/**
 * 通知不同的业务方
 * @author: qinfengsa
 * @date: 2019/3/28 00:37
 */
public interface NotifySource {

    /**
     * 通知业务方方法
     * @param order
     */
    void notify(Order order);
}
