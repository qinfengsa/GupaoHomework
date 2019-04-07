package com.qinfengsa.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 * @author: qinfengsa
 * @date: 2019/3/13 00:09
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    /**
     * 构建一个 Map容器，存放单例实例 通过key控制重复
     */
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
    public static Object getInstance(String className){
        //ConcurrentHashMap内部是线程安全的，put是线程安全的
        // 但这里的判断不是线程安全的，会影响返回的结果
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}

