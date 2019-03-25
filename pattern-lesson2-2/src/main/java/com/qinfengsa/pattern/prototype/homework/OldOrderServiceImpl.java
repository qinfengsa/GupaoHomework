package com.qinfengsa.pattern.prototype.homework;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qinfengsa.pattern.prototype.entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 工单实现类重构前
 * @author: qinfengsa
 * @date: 2019/3/17 23:13
 */
public class OldOrderServiceImpl implements OrderService {





    /**
     * 根据远程调用的JSON字符串生成工单
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
            for (int j = 0; j < num; j++) {
                Order order = new Order();
                order.setUserMobile(obj.getString("userMobile"));
                order.setUserName(obj.getString("userName"));

                order.setOrderNo(obj.getString("orderNo"));
                order.setBrandId(itemObj.getInteger("brandId"));
                order.setBrandName(itemObj.getString("brandName"));
                order.setItemCode(itemObj.getString("itemCode"));
                order.setItemName(itemObj.getString("itemName"));

                // ...
                // 省略n行代码
                // ...
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
