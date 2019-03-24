package com.qinfengsa.pattern.factory.abstractfactory;

import com.qinfengsa.pattern.factory.entity.*;

/**
 * 苹果工厂实现ElectronicFactory接口
 */
public class AppleFactory implements ElectronicFactory {
    public INoteBook createNoteBook() {
        return new MacBook();
    }

    public ITelPhone createPhone() {
        return new AppleIPhone();
    }

    public ITablet createTablet() {
        return new AppleIPad();
    }
}
