package com.qinfengsa.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * 单例
 * @author: qinfengsa
 * @date: 2019/3/23 00:18
 */
public enum EventBusSingle {
    /**
     * 单例
     */
    INSTANCE;

    private EventBus eventBus = null;

    /**
     * 构造时创建
     */
    EventBusSingle() {
        eventBus = new EventBus();
    }

    /**
     * 单例
     * @author wangheng
     * @date 2019/3/22 15:41
     * @return
     */
    public EventBus getInstance() {
        return eventBus;
    }

}
