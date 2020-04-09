package com.wjd.design.pattern.factoryPattern.abastractFactory;

/**
 * @ClassName Test
 * @Description 调用
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 14:33
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        ElectricApplianceFactory factory = new MeiDiElectricApplianceFactory();
        factory.createRefrigerator().production();
        factory.createTelevision().production();
        factory.createWashingMachine().production();

        factory = new XiaoMiElectricApplianceFactory();
        factory.createRefrigerator().production();
        factory.createTelevision().production();
        factory.createWashingMachine().production();
    }

}
