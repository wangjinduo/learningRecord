package com.wjd.design.pattern.singleton.hungrySingleton;

/**
 * @ClassName Enum
 * @Description 枚举式单例模式（注册式）
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-10 13:52
 * @Version 1.0
 **/
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
