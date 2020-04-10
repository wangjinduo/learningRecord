package com.wjd.design.pattern.singleton.idlerSingleton;

/**
 * @ClassName LazyIdlerSingletonTest
 * @Description 客户端测试
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-10 09:35
 * @Version 1.0
 **/
public class LazyIdlerSingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new TestThread());
        Thread thread2 = new Thread(new TestThread());
        thread1.start();
        thread2.start();
    }

}
