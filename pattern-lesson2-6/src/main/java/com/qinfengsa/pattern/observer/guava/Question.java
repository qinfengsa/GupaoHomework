package com.qinfengsa.pattern.observer.guava;

/**
 * 问题
 * @author: qinfengsa
 * @date: 2019/3/20 00:20
 */
public class Question {


    /**
     * 提问者
     */
    private String userName;

    /**
     * 问题内容
     */
    private String content;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
