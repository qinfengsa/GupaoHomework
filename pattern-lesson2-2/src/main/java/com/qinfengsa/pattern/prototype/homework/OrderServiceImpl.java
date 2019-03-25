package com.qinfengsa.pattern.prototype.homework;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qinfengsa.pattern.prototype.entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 工单实现类重构后
 * @author: qinfengsa
 * @date: 2019/3/17 23:15
 */
public class OrderServiceImpl implements OrderService {

    /**
     * 根据远程调用的JSON字符串生成工单 重构后的代码
     * @author qinfengsa
     * @date 2019/3/17 23:14
     * @param json
     */
    @Override
    public void createOrderByJson(String json) throws Exception {
        JSONObject obj = JSONObject.parseObject(json);
        JSONArray itemList = obj.getJSONArray("items");

        if (Objects.isNull(itemList) || itemList.size() == 0) {
            return;
        }
        List<Order> orderList = new ArrayList<Order>();
        for (int i = 0; i < itemList.size(); i++) {
            JSONObject itemObj = itemList.getJSONObject(i);
            // 如果有产品数量大于1 ，要生成多张工单
            int num = itemObj.getInteger("num");
            Order prototypeOrder = JSONObject.parseObject(itemObj.toJSONString(), Order.class);
            prototypeOrder.setUserMobile(obj.getString("userMobile"));
            prototypeOrder.setUserName(obj.getString("userName"));
            prototypeOrder.setOrderNo(obj.getString("orderNo"));
            // 生成id 这里用时间代替
            prototypeOrder.setId(System.currentTimeMillis());

            orderList.add(prototypeOrder);
            // j从1开始，第一张单已生成
            for (int j = 1; j < num; j++) {
                // 原型模式 ，克隆工单，节省代码量和资源
                Order order =  (Order) prototypeOrder.clone();

                // 生成id 这里用时间代替
                order.setId(System.currentTimeMillis());
                orderList.add(order);

            }
        }


        if (orderList.size() > 0) {
            //批量插入orderList
            //batchSave(orderList);
            for (Order thisOrder:orderList) {
                System.out.println(thisOrder.toString());
            }
        }

    }
}
