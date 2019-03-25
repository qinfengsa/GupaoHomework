package com.qinfengsa.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 猎头 CGLib动态代理
 * @author: qinfengsa
 * @date: 2019/3/24 18:49
 */
public class CGLibHeadhunter implements MethodInterceptor {

    /**
     * 通过Class 获取 被代理对象的引用
     * @param clazz
     * @return
     * @throws Exception
     */
    public Object getInstance(Class<?> clazz) throws Exception{
        //相当于Proxy，代理的工具类
        Enhancer enhancer = new Enhancer();
        // 生成一个继承clazz的子类
        enhancer.setSuperclass(clazz);
        // 回调父类的方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     *
     * @param o 被代理对象
     * @param method 代理方法
     * @param objects 参数列表
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        // invokeSuper 通过反射调用父类的方法
        Object object = methodProxy.invokeSuper(o,objects);
        after();
        return object;
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
