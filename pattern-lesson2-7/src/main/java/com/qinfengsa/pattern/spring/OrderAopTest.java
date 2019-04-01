package com.qinfengsa.pattern.spring;

import com.qinfengsa.pattern.spring.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * AOP 和DI测试
 * @author: qinfengsa
 * @date: 2019/3/17 23:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class OrderAopTest {

    /**
     * 依赖自动注入，不需要自己实例化
     */
    @Autowired
    private OrderService orderService;


    @Test
    public void testExportOrder() throws  Exception{
        // 导出数据的查询条件
        Map<String,Object> params = new HashMap<>(16);
        params.put("beginDate","2019-02-01");
        params.put("endDate","2019-02-28");
        try {
            orderService.exportOrder(params);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
