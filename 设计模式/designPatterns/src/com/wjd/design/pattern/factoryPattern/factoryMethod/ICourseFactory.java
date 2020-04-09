package com.wjd.design.pattern.factoryPattern.factoryMethod;

import com.wjd.design.pattern.factoryPattern.simpleFactory.ICourse;

/**
 * @ClassName ICourseFactory
 * @Description 课程接口工厂类（工厂方法模式）
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 13:43
 * @Version 1.0
 **/
public interface ICourseFactory {

    /**
     * 创建对应工厂类
     * @return
     */
    ICourse create();

}
