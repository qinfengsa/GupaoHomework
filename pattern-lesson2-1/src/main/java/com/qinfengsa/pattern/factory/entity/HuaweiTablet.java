package com.qinfengsa.pattern.factory.entity;

/**
 * 华为平板
 */
public class HuaweiTablet implements ITablet {
    @Override
    public void create() {
        System.out.println("华为平板开始生产");
    }
}
