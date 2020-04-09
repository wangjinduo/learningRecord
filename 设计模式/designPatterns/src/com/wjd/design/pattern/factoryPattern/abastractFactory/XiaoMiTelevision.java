package com.wjd.design.pattern.factoryPattern.abastractFactory;

/**
 * @ClassName MeiDiTelevision
 * @Description 小米产品族
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 14:28
 * @Version 1.0
 **/
public class XiaoMiTelevision implements ITelevision {

    @Override
    public void production() {
        System.out.println("生产小米品牌的电视机");
    }

}
