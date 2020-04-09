package com.wjd.design.pattern.factoryPattern.factoryMethod;

/**
 * @ClassName Test
 * @Description 调用
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 13:49
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.create().recordVideo();

        courseFactory = new BigDataCourseFactory();
        courseFactory.create().recordVideo();
    }

}
