package com.qinfengsa.pattern.strategy.refactor;

import com.qinfengsa.pattern.entity.Order;
import com.qinfengsa.pattern.enumtype.OrderSourceEnum;

/**
 * 工单实现类重构前
 * @author: qinfengsa
 * @date: 2019/3/17 23:13
 */
public class OldOrderServiceImpl implements OrderService {
    /**
     * 工单完成，根据来源类型通知不同的业务方
     * @param order
     * @throws Exception
     */
    @Override
    public void finishOrder(Order order) throws Exception {
        //根据来源类型
        if (order.getOrderSource() == OrderSourceEnum.SOURCE_A.getValue()) {
            NotifySourceA sourceA = new NotifySourceA();
            sourceA.notify(order);
        } else if (order.getOrderSource() == OrderSourceEnum.SOURCE_B.getValue()) {
            NotifySourceB sourceB = new NotifySourceB();
            sourceB.notify(order);
        } //...省略

    }
}
