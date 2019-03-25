package com.qinfengsa.pattern.proxy.refactor;

import com.qinfengsa.pattern.proxy.refactor.jdkproxy.ExcelExportProxy;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: qinfengsa
 * @date: 2019/3/17 23:24
 */
public class OrderTest {




    @Test
    public void testExportOrder() throws  Exception{
        // 导出数据的查询条件
        Map<String,Object> params = new HashMap<>(16);
        params.put("beginDate","2019-02-01");
        params.put("endDate","2019-02-28");


        try {
            OrderService orderService = (OrderService) new ExcelExportProxy().getInstance(new OrderServiceImpl());
            orderService.exportOrder(params);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
