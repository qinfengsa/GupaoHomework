package com.qinfengsa.pattern.enumtype;

/**
 * @author: qinfengsa
 * @date: 2019/3/28 00:52
 */
public enum OrderSourceEnum {
    /**
     * 来源A
     */
    SOURCE_A(1),
    /**
     * 来源B
     */
    SOURCE_B(2);

    /**
     * 键值
     */
    private int value;

    /**
     * 构造方法
     * @param value
     */
    OrderSourceEnum(int value) {
        this.value = value;
    }

    /**
     * 获取Value
     * @return
     */
    public int getValue() {
        return value;
    }
}
