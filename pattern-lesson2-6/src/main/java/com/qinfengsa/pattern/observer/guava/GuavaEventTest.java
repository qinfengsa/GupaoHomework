package com.qinfengsa.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * 利用Guava 实现社区提问
 * @author qinfengsa
 * @date 2019/3/23 0:17
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        GPer gper = GPer.getInstance();

        // 消息总线 枚举单例
        EventBus eventBus = EventBusSingle.INSTANCE.getInstance();
        // 构建两个观察者 tom 和 mic
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        // 注册观察者
        eventBus.register(tom);
        eventBus.register(mic);
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");


        gper.publishQuestion(question);

    }
}
