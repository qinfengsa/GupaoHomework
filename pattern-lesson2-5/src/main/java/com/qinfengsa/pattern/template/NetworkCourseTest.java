package com.qinfengsa.pattern.template;

/**
 * @author: qinfengsa
 * @date: 2019/3/28 23:38
 */
public class NetworkCourseTest {

    public static void main(String[] args) {

        System.out.println("---Java架构师课程---");
        NetworkCourse javaCourse = new NetworkCourse(new JavaHomework());
        javaCourse.createCourse();

        System.out.println("---大数据课程---");
        NetworkCourse bigDataCourse = new NetworkCourse(new BigDataHomework());
        bigDataCourse.createCourse();
    }
}
