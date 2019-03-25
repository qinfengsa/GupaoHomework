package com.qinfengsa.pattern.proxy.dynamicproxy.simulateproxy;

import java.lang.reflect.Method;

/**
 * 猎头 模拟JDK动态代理
 * @author: qinfengsa
 * @date: 2019/3/24 19:50
 */
public class MyHeadhunter implements MyInvocationHandler {


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
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    /**
     * 代理模式一般都会在方法前后进行功能增强，
     * 是和委派模式的重要区别
     */
    private void before() {
        System.out.println("我是猎头，需要确认你的工作要求");
        System.out.println("开始匹配");

    }
    private void after() {
        System.out.println("匹配成功，联系面试");
    }


}
