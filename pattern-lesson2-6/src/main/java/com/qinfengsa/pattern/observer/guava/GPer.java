package com.qinfengsa.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * 被观察者 GPer
 * @author: qinfengsa
 * @date: 2019/3/20 00:19
 */
public class GPer {
    private String name = "GPer生态圈";

    /**
     * 构造方法私有化
     */
    private GPer(){}

    public static GPer getInstance(){
        return GPerInner.INSTANCE;
    }
    /**
     * 静态内部类
     */
    private static class GPerInner {
        /**
         * 单例模式
         */
        private final static GPer INSTANCE = new GPer();
    }



    public String getName() {
        return name;
    }

    /**
     * 提交问题，触发发送消息事件
     * @author wangheng
     * @date 2019/3/22 15:13
     * @param question
     */
    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.getName() + "上提交了一个问题。");

        // 触发event
        NotifyEvent event = new NotifyEvent();
        event.setQuestion(question);
        event.setObserverName(this.getName());

        // 向观察者-发送消息 eventBus 单例
        EventBus eventBus = EventBusSingle.INSTANCE.getInstance();
        eventBus.post(event);

    }
}
