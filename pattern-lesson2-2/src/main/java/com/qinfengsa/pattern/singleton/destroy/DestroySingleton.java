package com.qinfengsa.pattern.singleton.destroy;

import com.qinfengsa.pattern.singleton.hungry.HungrySingleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 破坏单例
 * @author: qinfengsa
 * @date: 2019/3/13 20:19
 */
public class DestroySingleton {

    public static void main(String[] args) {
        Reflection();
        Serialization();
    }

    private static void Reflection() {
        try {
            HungrySingleton singleton = HungrySingleton.getInstance();
            System.out.println(singleton);

            // 构造器
            Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
            // 取消Java的权限控制检查
            constructor.setAccessible(true);


            HungrySingleton singleton2 = (HungrySingleton) constructor.newInstance();
            System.out.println(singleton2);
            System.out.println(singleton == singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Serialization() {
        try {
            HungrySingleton singleton = HungrySingleton.getInstance();
            singleton.setName("wang");
            FileOutputStream fos = new FileOutputStream("tmpFile");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("tmpFile");
            ObjectInputStream ois = new ObjectInputStream(fis);
            HungrySingleton singleton2 = (HungrySingleton) ois.readObject();

            ois.close();
            System.out.println(singleton2.getName());
            System.out.println(singleton);
            System.out.println(singleton2);
            System.out.println(singleton == singleton2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
