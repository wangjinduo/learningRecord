package com.wjd.design.pattern.factoryPattern.factoryMethod;

import com.wjd.design.pattern.factoryPattern.simpleFactory.BigDataCourse;
import com.wjd.design.pattern.factoryPattern.simpleFactory.ICourse;

/**
 * @ClassName BigDataCourseFactory
 * @Description 大数据工厂类
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 13:49
 * @Version 1.0
 **/
public class BigDataCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new BigDataCourse();
    }

}
