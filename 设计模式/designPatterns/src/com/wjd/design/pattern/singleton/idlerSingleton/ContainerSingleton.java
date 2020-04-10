package com.wjd.design.pattern.singleton.idlerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ContainerSingleton
 * @Description 容器缓存式单例
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-10 14:40
 * @Version 1.0
 **/
public class ContainerSingleton {

    private ContainerSingleton() {}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object> ();

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }

}
