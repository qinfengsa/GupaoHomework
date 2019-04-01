package com.qinfengsa.pattern.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面实现类
 * @author: qinfengsa
 * @date: 2019/4/1 22:30
 */
@Aspect
@Component
public class LogTimeAspect {


    /**
     * 切面切点
     */
    @Pointcut("@annotation(com.qinfengsa.pattern.spring.annotation.LogTime)")
    public void logTimeAspect() {

    }

    @Around("logTimeAspect()")
    public Object setLogTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Long start = before();
        Object result = joinPoint.proceed(joinPoint.getArgs());

        Long end = after();
        System.out.println("导出耗时："+ ((end - start)/1000) + "秒");

        return result;

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
