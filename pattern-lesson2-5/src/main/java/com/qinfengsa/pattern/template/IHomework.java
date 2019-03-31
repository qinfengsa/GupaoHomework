package com.qinfengsa.pattern.template;

/**
 * homework接口
 * @author: qinfengsa
 * @date: 2019/3/28 23:33
 */
public interface IHomework {

    /**
     * 检查作业方法
     */
    void checkHomework();

    /**
     * 是否有作业
     * @return
     */
    boolean needHomework();
}
