package com.qinfengsa.pattern.factory;


import com.qinfengsa.pattern.factory.entity.INoteBook;

/**
 * 简单工厂测试
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        NoteBookFactory factory = new NoteBookFactory();
        INoteBook book = factory.create(2);//通过参数获取不同的笔记本
        book.create();

    }
}
