package com.qinfengsa.pattern.factory.abstractfactory;

/**
 * 抽象工厂
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 创建华为工厂
        HuaweiFactory factory = new HuaweiFactory();

        factory.createNoteBook().create();
        factory.createPhone().create();

    }

}
