package com.qinfengsa.pattern.factory.entity;

/**
 * iPad
 */
public class AppleIPad implements ITablet {
    @Override
    public void create() {
        System.out.println("苹果iPad开始生产");
    }
}
