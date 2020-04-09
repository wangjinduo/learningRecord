package com.wjd.design.pattern.factoryPattern.simpleFactory;

/**
 * @ClassName Test
 * @Description 调用
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 10:04
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        CourseFactory.create(JavaCourse.class).recordVideo();
    }

}
