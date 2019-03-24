package com.qinfengsa.pattern.factory.factorymethod;


import com.qinfengsa.pattern.factory.entity.INoteBook;
import com.qinfengsa.pattern.factory.entity.MacBook;

/**
 * 苹果MacBook 工厂
 */
public class MacBookFactory implements INoteBookFactory {
    @Override
    public INoteBook create() {
        return new MacBook();
    }
}
