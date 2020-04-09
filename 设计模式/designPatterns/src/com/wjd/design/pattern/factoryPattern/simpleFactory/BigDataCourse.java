package com.wjd.design.pattern.factoryPattern.simpleFactory;

/**
 * @ClassName BigDataCourse
 * @Description 大数据课程
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 10:11
 * @Version 1.0
 **/
public class BigDataCourse implements ICourse {

    @Override
    public void recordVideo() {
        System.out.println("开始录制BigDataCourse课程视频");
    }

}
