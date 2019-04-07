package com.qinfengsa.pattern.singleton.threadlocal;

/**
 * 在同一个线程中，始终是单例的
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
        new ThreadLocal<ThreadLocalSingleton>(){
            @Override
            protected ThreadLocalSingleton initialValue() {
                return new ThreadLocalSingleton();
            }
        };

    /**
     * 构造方法私有化，防止被实例化
     */
    private ThreadLocalSingleton(){}


    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
