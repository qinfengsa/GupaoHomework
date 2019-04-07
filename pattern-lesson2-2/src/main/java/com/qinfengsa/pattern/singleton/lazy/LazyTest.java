package com.qinfengsa.pattern.singleton.lazy;


/**
 * @author: qinfengsa
 * @date: 2019/3/12 23:15
 */
public class LazyTest {

    public static void main(String[] args) {
        lazyTest1();
        lazyTest2();
    }
    private static void lazyTest1() {
        Long time1 = System.currentTimeMillis();
        LazyInnerClassSingleton singleton1 = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton singleton2 = LazyInnerClassSingleton.getInstance();
        System.out.println(singleton1);

        System.out.println(singleton2);

        System.out.println(singleton1 == singleton2);
        Long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }

    private static void lazyTest2() {
        Long time1 = System.currentTimeMillis();
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton1);

        System.out.println(singleton2);

        System.out.println(singleton1 == singleton2);
        Long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
}
