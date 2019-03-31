package com.qinfengsa.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 观察者 teacher 观察GPer的行为
 * @author: qinfengsa
 * @date: 2019/3/20 00:21
 */
public class Teacher   {

    private String name;
    public Teacher(String name){
        this.name = name;
    }

    @Subscribe
    public void getMessage(final NotifyEvent event) {
        Question question = event.getQuestion();
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + event.getObserverName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }

}
