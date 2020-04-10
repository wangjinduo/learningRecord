package com.wjd.design.pattern.singleton.idlerSingleton;

/**
 * @ClassName TestThread
 * @Description 测试懒汉式单例
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-10 09:33
 * @Version 1.0
 **/
public class TestThread implements Runnable {

    @Override
    public void run() {
        LazyIdlerSingleton lazyIdlerSingleton = LazyIdlerSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazyIdlerSingleton);
    }

}
