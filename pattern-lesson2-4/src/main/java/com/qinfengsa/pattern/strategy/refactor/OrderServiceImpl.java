package com.qinfengsa.pattern.strategy.refactor;

import com.qinfengsa.pattern.entity.Order;
import com.qinfengsa.pattern.enumtype.OrderSourceEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * 工单实现类重构后
 * @author: qinfengsa
 * @date: 2019/3/17 23:15
 */
public class OrderServiceImpl implements OrderService {

    /**
     * 来源类型集合，在spring中可以通过xml配置注入mapbean class="org.springframework.beans.factory.config.MapFactoryBean"
     */
    private static Map<Integer,NotifySource> sourceMap = new HashMap<>(16);

    static {
        sourceMap.put(OrderSourceEnum.SOURCE_A.getValue(),new NotifySourceA());
        sourceMap.put(OrderSourceEnum.SOURCE_B.getValue(),new NotifySourceB());
    }

    /**
     * 工单完成，根据来源类型通知不同的业务方
     * @param order
     * @throws Exception
     */
    @Override
    public void finishOrder(Order order) throws Exception {
        // 通过策略获取对应的接口
        NotifySource source = sourceMap.get(order.getOrderSource());
        if (Objects.nonNull(source)) {
            source.notify(order);
        }
    }
}
