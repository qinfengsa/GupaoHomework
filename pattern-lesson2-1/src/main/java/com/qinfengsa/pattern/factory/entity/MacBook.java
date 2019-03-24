package com.qinfengsa.pattern.factory.entity;

/**
 * 苹果MacBook
 */
public class MacBook implements INoteBook {

    @Override
    public void create() {
        System.out.println("苹果MacBook开始生产");
    }
}
