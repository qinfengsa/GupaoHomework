package com.qinfengsa.pattern.factory.entity;

/**
 * iPhone
 */
public class AppleIPhone implements ITelPhone {
    @Override
    public void create() {
        System.out.println("苹果iPhone开始生产");
    }
}
