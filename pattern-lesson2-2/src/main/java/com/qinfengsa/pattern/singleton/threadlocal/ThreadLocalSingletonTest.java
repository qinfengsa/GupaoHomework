package com.qinfengsa.pattern.singleton.threadlocal;

/**
 * ThreadLocal单例测试
 * @author: qinfengsa
 * @date: 2019/3/15 22:03
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        // 在同一个线程中保证单例
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
    }
}
