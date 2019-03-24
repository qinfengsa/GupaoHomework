package com.qinfengsa.pattern.factory.factorymethod;


import com.qinfengsa.pattern.factory.entity.INoteBook;

/**
 * 工厂方法test.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        INoteBookFactory factory = new MacBookFactory();
        INoteBook book = factory.create();
        book.create();

        factory = new MateBookFactory();
        book = factory.create();
        book.create();

    }

}
