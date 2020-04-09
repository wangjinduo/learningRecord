package com.wjd.design.pattern.factoryPattern.abastractFactory;

/**
 * @ClassName MeiDiWashingMachine
 * @Description 小米产品族
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 14:29
 * @Version 1.0
 **/
public class XiaoMiWashingMachine implements IWashingMachine {

    @Override
    public void production() {
        System.out.println("生产小米品牌的电视机");
    }

}
