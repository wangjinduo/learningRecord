package com.wjd.design.pattern.singleton.idlerSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName LazyInnerClassSingleton
 * @Description 懒汉式单例模式（静态内部类）客户端调试
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-10 09:53
 * @Version 1.0
 **/
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
//        Thread thread1 = new Thread(new TestInnerClassThread());
//        Thread thread2 = new Thread(new TestInnerClassThread());
//        thread1.start();
//        thread2.start();
        try {
            // 当然这是处于一个很无聊的状态下进行破坏单例
            Class<?> clazz = LazyInnerClassSingleton.class;

            // 通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            // 强制访问
            c.setAccessible(true);

            // 初始化第一次
            Object obj1 = c.newInstance();

            // 初始化第二次
            Object obj2 = c.newInstance();

            System.out.println(obj1 + "\n" + obj2);
            System.out.println(obj1 == obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
