package com.wjd.design.pattern.factoryPattern.simpleFactory;

/**
 * @ClassName CourseFactory
 * @Description 课程工厂类（简单工厂模式）
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 10:12
 * @Version 1.0
 **/
public class CourseFactory {

    public static ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
