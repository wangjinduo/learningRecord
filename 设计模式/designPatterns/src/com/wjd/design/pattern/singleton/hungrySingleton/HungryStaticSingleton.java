package com.wjd.design.pattern.singleton.hungrySingleton;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式静态块单例模式
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-10 09:19
 * @Version 1.0
 **/
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }

}
