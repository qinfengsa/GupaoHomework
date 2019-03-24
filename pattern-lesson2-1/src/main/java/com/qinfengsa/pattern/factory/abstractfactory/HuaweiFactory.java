package com.qinfengsa.pattern.factory.abstractfactory;

import com.qinfengsa.pattern.factory.entity.*;

/**
 * 华为工厂实现ElectronicFactory接口
 */
public class HuaweiFactory implements ElectronicFactory {

    @Override
    public INoteBook createNoteBook() {
        return new MateBook();
    }
    @Override
    public ITelPhone createPhone() {
        return new MatePhone();
    }
    @Override
    public ITablet createTablet() {
        return new HuaweiTablet();
    }
}
