package com.wjd.design.pattern.factoryPattern.simpleFactory;

/**
 * @ClassName JavaCourse
 * @Description Java课程
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 10:03
 * @Version 1.0
 **/
public class JavaCourse implements ICourse {

    @Override
    public void recordVideo() {
        System.out.println("开始录制Java课程视频");
    }

}
