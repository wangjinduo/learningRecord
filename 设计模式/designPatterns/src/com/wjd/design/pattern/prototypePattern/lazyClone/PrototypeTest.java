package com.wjd.design.pattern.prototypePattern.lazyClone;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PrototypeTest
 * @Description 调用测试
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-17 14:25
 * @Version 1.0
 **/
public class PrototypeTest {

    public static void main(String[] args) {
        // 创建一个将要被克隆的对象
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(27);
        concretePrototype.setName("prototype");
        List<String> hobbies = new ArrayList<String>();
        concretePrototype.setHobbies(hobbies);
        System.out.println(concretePrototype);

        // 创建 Client 对象，准备开始克隆
        Client client = new Client(concretePrototype);
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);
        System.out.println("克隆对象中的引用类型地址值:" + concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值:" + concretePrototype.getHobbies());
        System.out.println("对象地址比较:"+(concretePrototypeClone.getHobbies() ==
                concretePrototype.getHobbies()));
    }

}
