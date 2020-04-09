package com.wjd.design.pattern.factoryPattern.factoryMethod;

import com.wjd.design.pattern.factoryPattern.simpleFactory.ICourse;
import com.wjd.design.pattern.factoryPattern.simpleFactory.JavaCourse;

/**
 * @ClassName JavaCourseFactory
 * @Description Java工厂类
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 13:47
 * @Version 1.0
 **/
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }

}
