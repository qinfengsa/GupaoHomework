package com.qinfengsa.pattern.strategy.refactor;

import com.qinfengsa.pattern.entity.Order;

/**
 * 通知业务方A
 * @author: qinfengsa
 * @date: 2019/3/28 00:39
 */
public class NotifySourceA implements NotifySource {
    @Override
    public void notify(Order order) {
        System.out.println("工单已完成，通知业务方A");
    }
}
