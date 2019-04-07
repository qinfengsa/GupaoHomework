package com.qinfengsa.pattern.singleton.hungry;

/**
 * 饿汉式测试
 * @auther: qinfengsa
 * @date: 2019/3/11 00:36
 */
public class HungryTest {

    public static void main(String[] args) {
        HungrySingleton singleton1 =   HungrySingleton.getInstance();
        HungrySingleton singleton2 =   HungrySingleton.getInstance();
        System.out.println(singleton1);

        System.out.println(singleton2);

        System.out.println(singleton1 == singleton2);
    }
}
