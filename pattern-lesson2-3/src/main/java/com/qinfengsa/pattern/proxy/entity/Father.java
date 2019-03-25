package com.qinfengsa.pattern.proxy.entity;

/**
 * 静态代理 代理对象 Father
 * @author: qinfengsa
 * @date: 2019/3/24 18:02
 */
public class Father {

    private IPerson son;

    /**
     * 通过构造方法把son的引用拿到
     * @param son
     */
    public Father(IPerson son) {
        this.son = son;
    }

    public void findJob() {
        System.out.println("开始帮儿子找工作");
        this.son.findJob();
        System.out.println("联系单位，准备面试");
    }

}
