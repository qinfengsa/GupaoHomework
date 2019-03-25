package com.qinfengsa.pattern.proxy.dynamicproxy.jdkproxy;

import com.qinfengsa.pattern.proxy.entity.Candidate;
import com.qinfengsa.pattern.proxy.entity.IPerson;

/**
 * JDK 动态代理
 * @author: qinfengsa
 * @date: 2019/3/24 18:18
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            IPerson person = (IPerson) new JDKHeadhunter().getInstance(new Candidate());
            person.findJob();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
