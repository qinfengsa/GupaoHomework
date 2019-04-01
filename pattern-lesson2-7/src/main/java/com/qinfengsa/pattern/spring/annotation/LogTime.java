package com.qinfengsa.pattern.spring.annotation;

import java.lang.annotation.*;

/**
 * 日志打印,记录方法开始和结束时间
 * @author: qinfengsa
 * @date: 2019/4/1 21:59
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface LogTime {

    String value() default "";
}
