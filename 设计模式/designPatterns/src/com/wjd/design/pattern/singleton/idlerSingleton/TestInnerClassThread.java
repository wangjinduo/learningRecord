package com.wjd.design.pattern.singleton.idlerSingleton;

/**
 * @ClassName TestThread
 * @Description 测试懒汉式单例
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-10 09:33
 * @Version 1.0
 **/
public class TestInnerClassThread implements Runnable {

    @Override
    public void run() {
        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazyInnerClassSingleton);
    }

}
