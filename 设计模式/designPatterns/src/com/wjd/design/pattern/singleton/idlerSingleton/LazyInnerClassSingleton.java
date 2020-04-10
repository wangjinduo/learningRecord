package com.wjd.design.pattern.singleton.idlerSingleton;

/**
 * @ClassName LazyInnerClassSingleton
 * @Description 懒汉式单例模式（静态内部类）
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-10 09:53
 * @Version 1.0
 **/
public class LazyInnerClassSingleton {

    // 如果不使用，内部类是不加载的
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY_INNER_CLASS_SINGLETON != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY_INNER_CLASS_SINGLETON;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }

}
