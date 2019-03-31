package com.qinfengsa.pattern.template;

/**
 * @author: qinfengsa
 * @date: 2019/3/28 23:37
 */
public class BigDataHomework implements IHomework {
    @Override
    public void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    public boolean needHomework() {
        return true;
    }
}
