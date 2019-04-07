package com.qinfengsa.pattern.singleton.threadlocal;

/**
 * @author: qinfengsa
 * @date: 2019/3/15 22:09
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}

