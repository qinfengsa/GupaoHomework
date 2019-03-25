package com.qinfengsa.pattern.proxy.refactor;


import java.util.Map;

/**
 * 工单实现类
 * @author: qinfengsa
 * @date: 2019/3/17 23:15
 */
public class OrderServiceImpl implements OrderService {

    /**
     * 导出订单Excel
     * @param params
     * @throws Exception
     */
    @Override
    public void exportOrder(Map<String,Object> params)  throws Exception {

        System.out.println("导出进行中");
        //5秒后执行，验证
        Thread.sleep(5000);

    }
}
