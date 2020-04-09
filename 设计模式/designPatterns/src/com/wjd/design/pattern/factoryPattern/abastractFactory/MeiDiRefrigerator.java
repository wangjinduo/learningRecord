package com.wjd.design.pattern.factoryPattern.abastractFactory;

/**
 * @ClassName MeiDiRefrigerator
 * @Description 美的产品族
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 14:26
 * @Version 1.0
 **/
public class MeiDiRefrigerator implements IRefrigerator {

    @Override
    public void production() {
        System.out.println("生产美的品牌的冰箱");
    }

}
