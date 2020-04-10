package com.wjd.design.pattern.singleton.hungrySingleton;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式单例模式
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-10 09:19
 * @Version 1.0
 **/
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton () {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
