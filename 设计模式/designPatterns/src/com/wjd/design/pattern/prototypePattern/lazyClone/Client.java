package com.wjd.design.pattern.prototypePattern.lazyClone;

/**
 * @ClassName Client
 * @Description 原型模式（简单克隆）
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-17 13:53
 * @Version 1.0
 **/
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype) {
        return (Prototype)concretePrototype.clone();
    }

}
