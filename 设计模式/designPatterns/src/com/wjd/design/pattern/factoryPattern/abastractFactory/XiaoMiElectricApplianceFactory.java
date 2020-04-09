package com.wjd.design.pattern.factoryPattern.abastractFactory;

/**
 * @ClassName MeiDiElectricApplianceFactory
 * @Description 小米产品族具体工厂类
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 14:30
 * @Version 1.0
 **/
public class XiaoMiElectricApplianceFactory implements ElectricApplianceFactory {

    @Override
    public IRefrigerator createRefrigerator() {
        return new XiaoMiRefrigerator();
    }

    @Override
    public ITelevision createTelevision() {
        return new XiaoMiTelevision();
    }

    @Override
    public IWashingMachine createWashingMachine() {
        return new XiaoMiWashingMachine();
    }
}
