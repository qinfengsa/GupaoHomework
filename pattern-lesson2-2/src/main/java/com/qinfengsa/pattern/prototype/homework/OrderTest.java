package com.qinfengsa.pattern.prototype.homework;

import org.junit.Test;

/**
 * @author: qinfengsa
 * @date: 2019/3/17 23:24
 */
public class OrderTest {

    private static String json = "{\n" +
            "'userMobile': '123456',\n" +
            "'userName': '张三',\n" +
            "'orderNo': '00001',\n" +
            "'items': [{\n" +
            "'brandId': 1,\n" +
            "'brandName': '品牌A',\n" +
            "'itemCode': 'TM001',\n" +
            "'itemName': '产品A',\n" +
            "'num': 2\n" +
            "}, {\n" +
            "'brandId': 2,\n" +
            "'brandName': '品牌B',\n" +
            "'itemCode': 'TM002',\n" +
            "'itemName': '产品B',\n" +
            "'num': 5\n" +
            "}]\n" +
            "}";

    @Test
    public void testCreateOld() throws  Exception{
        OrderService service = new OrderServiceImpl_Old();
        service.createOrderByJson(json);




    }

    @Test
    public void testCreate() throws  Exception{
        OrderService service = new OrderServiceImpl();
        service.createOrderByJson(json);


    }
}
