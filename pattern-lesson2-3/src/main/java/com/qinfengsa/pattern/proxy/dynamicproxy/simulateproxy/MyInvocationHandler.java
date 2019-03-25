package com.qinfengsa.pattern.proxy.dynamicproxy.simulateproxy;

import java.lang.reflect.Method;

/**
 *
 * @author: qinfengsa
 * @date: 2019/3/24 22:10
 */
public interface MyInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
