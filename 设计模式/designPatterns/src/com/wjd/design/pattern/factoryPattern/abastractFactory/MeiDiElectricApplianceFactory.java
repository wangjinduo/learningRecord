package com.wjd.design.pattern.factoryPattern.abastractFactory;

/**
 * @ClassName MeiDiElectricApplianceFactory
 * @Description 美的产品族具体工厂类
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 14:30
 * @Version 1.0
 **/
public class MeiDiElectricApplianceFactory implements ElectricApplianceFactory {

    @Override
    public IRefrigerator createRefrigerator() {
        return new MeiDiRefrigerator();
    }

    @Override
    public ITelevision createTelevision() {
        return new MeiDiTelevision();
    }

    @Override
    public IWashingMachine createWashingMachine() {
        return new MeiDiWashingMachine();
    }
}
