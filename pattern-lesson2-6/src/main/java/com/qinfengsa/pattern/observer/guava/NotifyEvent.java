package com.qinfengsa.pattern.observer.guava;

/**
 * 通知事件 定义关系：
 * 这个类 用来 描述被观察者和观察者之间，统一的事件关系
 * 可以为空，也可以加上参数并通过get/set方法绑定。
 * @author: qinfengsa
 * @date: 2019/3/20 00:32
 */
public class NotifyEvent {
    /**
     * 问题
     */
    private Question question;

    /**
     * 观察者名称
     */
    private String observerName;


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }


    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

}
