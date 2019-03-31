package com.qinfengsa.pattern.template;

/**
 * java课程课后作业
 * @author: qinfengsa
 * @date: 2019/3/28 23:36
 */
public class JavaHomework implements IHomework {
    @Override
    public void checkHomework() {
        System.out.println("检查Java的课后作业");
    }

    @Override
    public boolean needHomework() {
        return false;
    }
}
