package com.qinfengsa.pattern.proxy.dynamicproxy.simulateproxy;

import com.qinfengsa.pattern.proxy.entity.Candidate;
import com.qinfengsa.pattern.proxy.entity.IPerson;

/**
 * @author: qinfengsa
 * @date: 2019/3/24 23:32
 */
public class MyProxyTest {


    public static void main(String[] args) {

        try {

            //JDK动态代理的实现原理
            IPerson obj = (IPerson) new MyHeadhunter().getInstance(new Candidate());
            System.out.println(obj.getClass());
            obj.findJob();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
