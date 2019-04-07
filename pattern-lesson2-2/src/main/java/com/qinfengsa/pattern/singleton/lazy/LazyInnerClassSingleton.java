package com.qinfengsa.pattern.singleton.lazy;

/**
 * 静态内部类
 * @author: qinfengsa
 * @date: 2019/3/12 01:18
 */
public class LazyInnerClassSingleton {

    /**
     * 默认使用LazyInnerClassGeneral的时候，会先初始化内部类
     * 如果没使用的话，内部类是不加载的
     */
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * static 是为了使单例的空间共享
     * final 保证这个方法不会被重写，重载
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    /**
     * 默认不加载
     */
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
