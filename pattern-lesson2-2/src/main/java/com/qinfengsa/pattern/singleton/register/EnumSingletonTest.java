package com.qinfengsa.pattern.singleton.register;

/**
 * 枚举式单例
 * @author: qinfengsa
 * @date: 2019/3/13 00:06
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.getInstance();
        EnumSingleton singleton2 = EnumSingleton.getInstance();
        System.out.println(singleton1);

        System.out.println(singleton2);

        System.out.println(singleton1 == singleton2);
    }
}
