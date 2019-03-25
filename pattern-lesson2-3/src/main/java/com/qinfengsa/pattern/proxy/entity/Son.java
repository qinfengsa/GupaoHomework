package com.qinfengsa.pattern.proxy.entity;

/**
 * 被代理对象 Son
 * @author: qinfengsa
 * @date: 2019/3/24 17:59
 */
public class Son implements IPerson {


    @Override
    public void findJob() {
        System.out.println("工资高");
        System.out.println("福利好");
        System.out.println("不加班");
    }
}
