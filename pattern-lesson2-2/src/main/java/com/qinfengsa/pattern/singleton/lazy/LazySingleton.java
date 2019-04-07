package com.qinfengsa.pattern.singleton.lazy;

/**
 * 只有被调用的时候才会实例化
 * @auther: qinfengsa
 * @date: 2019/3/11 00:15
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    /**
     * 构造方法私有化，防止被实例化
     */
    private LazySingleton() {};

    /**
     * 双重锁
     * @return
     */
    public static LazySingleton getInstance() {
        // 判断 lazySingleton为空时,才对线程加锁，否则直接返回，避免影响性能
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                // 线程安全的内部 判断 lazySingleton为空，这进行初始化
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;

    }


}

