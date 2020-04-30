package com.wjd.design.pattern.prototypePattern.lazyClone;

import java.util.List;

/**
 * @ClassName ConcretePrototypeA
 * @Description 原型模式（简单克隆）
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-17 13:53
 * @Version 1.0
 **/
public class ConcretePrototypeA implements Prototype {

    // 年龄
    private int age;

    // 姓名
    private String name;

    // 兴趣爱好
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setHobbies(this.hobbies);
        return concretePrototypeA;
    }
}
