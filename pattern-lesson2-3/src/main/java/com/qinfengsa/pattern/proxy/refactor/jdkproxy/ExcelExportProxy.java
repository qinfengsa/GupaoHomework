package com.qinfengsa.pattern.proxy.refactor.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author: qinfengsa
 * @date: 2019/3/25 23:01
 */
public class ExcelExportProxy implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object target;


    /**
     * 通过方法把被代理对象注入，生成代理的实例
     * @param person
     * @return
     * @throws Exception
     */
    public Object getInstance(Object person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    /**
     * 代理方法通过反射实现
     * @param proxy 代理对象
     * @param method 代理方法
     * @param args 参数数组
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Long start = before();
        Object obj = method.invoke(this.target,args);
        Long end = after();
        System.out.println("导出耗时："+ ((end - start)/1000) + "秒");
        return obj;
    }

    /**
     * 代理模式一般都会在方法前后进行功能增强，
     * 是和委派模式的重要区别
     */
    private Long before() {
        Long time = System.currentTimeMillis();
        System.out.println("开始导出：当前时间-" +time);
        return time;

    }
    private Long after() {
        Long time = System.currentTimeMillis();
        System.out.println("导出结束：当前时间-"+ time);
        return time;
    }
}
