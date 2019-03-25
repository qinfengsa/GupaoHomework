package com.qinfengsa.pattern.proxy.dynamicproxy.cglibproxy;

import com.qinfengsa.pattern.proxy.entity.Candidate;
import com.qinfengsa.pattern.proxy.entity.IPerson;

/**
 * CGLib 动态代理
 * @author: qinfengsa
 * @date: 2019/3/24 18:49
 */
public class CGLibProxyTest {

    public static void main(String[] args) {
        try {
            IPerson person = (Candidate) new CGLibHeadhunter().getInstance(Candidate.class);
       
            person.findJob();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
