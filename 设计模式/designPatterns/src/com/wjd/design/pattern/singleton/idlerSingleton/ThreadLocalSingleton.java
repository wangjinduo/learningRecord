package com.wjd.design.pattern.singleton.idlerSingleton;

/**
 * @ClassName ThreadLocalSingleton
 * @Description 线程见单例
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Version 1.0
 **/
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ThreadLocalRunnable());
        Thread t2 = new Thread(new ThreadLocalRunnable());
        t1.start();
        t2.start();
    }

    private static class ThreadLocalRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
            System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        }

    }
}
