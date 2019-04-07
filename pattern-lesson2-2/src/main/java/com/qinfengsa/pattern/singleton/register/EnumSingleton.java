package com.qinfengsa.pattern.singleton.register;

/**
 * 枚举单例
 * @author: qinfengsa
 * @date: 2019/3/13 00:04
 */
public enum EnumSingleton {
    /**
     * 单例枚举值
     */
    INSTANCE;

    private Object data;
    /**
     *
     * @return
     */
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }


    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
