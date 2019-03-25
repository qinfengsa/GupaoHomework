package com.qinfengsa.pattern.proxy.entity;

/**
 * 求职人员，被代理对象
 * @author: qinfengsa
 * @date: 2019/3/24 18:43
 */
public class Candidate implements IPerson{

    @Override
    public void findJob() {
        System.out.println("工资高");
        System.out.println("福利好");
        System.out.println("不加班");
    }
}
