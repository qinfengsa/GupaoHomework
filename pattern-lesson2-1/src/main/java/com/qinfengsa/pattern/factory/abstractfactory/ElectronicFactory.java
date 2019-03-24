package com.qinfengsa.pattern.factory.abstractfactory;

import com.qinfengsa.pattern.factory.entity.INoteBook;
import com.qinfengsa.pattern.factory.entity.ITablet;
import com.qinfengsa.pattern.factory.entity.ITelPhone;

/**
 * 一个可以生产手机、笔记本、平板的工厂接口
 */
public interface ElectronicFactory {

    INoteBook createNoteBook();

    ITelPhone createPhone();

    ITablet createTablet();
}
