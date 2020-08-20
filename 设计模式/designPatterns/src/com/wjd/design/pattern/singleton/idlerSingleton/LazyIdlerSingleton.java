package com.wjd.design.pattern.singleton.idlerSingleton;

/**
 * @ClassName LazyIdlerSingleton
 * @Description 简单的懒汉式单例实现
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Version 1.0
 **/
public class LazyIdlerSingleton {

    private LazyIdlerSingleton() {}

    private static LazyIdlerSingleton lazyIdlerSingleton = null;

    public static LazyIdlerSingleton getInstance() {
        if (lazyIdlerSingleton == null) {
            synchronized (LazyIdlerSingleton.class) {
                if (lazyIdlerSingleton == null) {
                    lazyIdlerSingleton = new LazyIdlerSingleton();
                }
            }
        }
        return lazyIdlerSingleton;
    }

}
