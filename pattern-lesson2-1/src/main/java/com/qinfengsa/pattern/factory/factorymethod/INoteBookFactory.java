package com.qinfengsa.pattern.factory.factorymethod;

import com.qinfengsa.pattern.factory.entity.INoteBook;

/**
 * 笔记本接口工厂
 */
public interface INoteBookFactory {

    INoteBook create();
}
