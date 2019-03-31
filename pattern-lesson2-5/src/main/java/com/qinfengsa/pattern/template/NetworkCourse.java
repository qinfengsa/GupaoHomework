package com.qinfengsa.pattern.template;

/**
 * @author: qinfengsa
 * @date: 2019/3/28 23:32
 */
public class NetworkCourse {

    /**
     * 持有IHomework 接口
     */
    private IHomework homework;

    /**
     * 私有化
     */
    private NetworkCourse() {

    }

    /**
     * 通过构造方法 注入IHomework 接口 来实现模版模式
     */
    public NetworkCourse(IHomework homework) {
        this.homework = homework;
    }


    /**
     * 通过homework 引用来试下模版模式
     */
    public final void createCourse(){
        //1、发布预习资料
        this.postPreResource();

        //2、制作PPT课件
        this.createPPT();

        //3、在线直播
        this.liveVideo();

        //4、提交课件、课堂笔记
        this.postNote();

        //5、提交源码
        this.postSource();

        //6、布置作业，有些课是没有作业，有些课是有作业的
        //如果有作业的话，检查作业，如果没作业，完成了
        // 通过持有不同的接口来试下模版模式
        if (homework.needHomework()) {
            homework.checkHomework();
        }

    }


    final void postSource(){
        System.out.println("提交源代码");
    }

    final void postNote(){
        System.out.println("提交课件和笔记");
    }

    final void liveVideo(){
        System.out.println("直播授课");
    }

    final void createPPT(){
        System.out.println("创建备课PPT");
    }

    final void postPreResource(){
        System.out.println("分发预习资料");
    }

}
