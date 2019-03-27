package com.qinfengsa.pattern.strategy.refactor;

import com.qinfengsa.pattern.entity.Order;
import org.junit.Test;

/**
 * @author: qinfengsa
 * @date: 2019/3/17 23:24
 */
public class OrderTest {



    @Test
    public void testCreateOld() throws  Exception{
        Order order = new Order();

        order.setOrderSource(1);
        OrderService service = new OldOrderServiceImpl();
        service.finishOrder(order);
    }

    @Test
    public void testCreate() throws  Exception{
        Order order = new Order();

        order.setOrderSource(2);
        OrderService service = new OrderServiceImpl();
        service.finishOrder(order);


    }
}
