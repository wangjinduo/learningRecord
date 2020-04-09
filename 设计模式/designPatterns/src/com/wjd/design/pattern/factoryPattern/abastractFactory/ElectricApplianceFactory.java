package com.wjd.design.pattern.factoryPattern.abastractFactory;

/**
 * @ClassName ElectricApplianceFactory
 * @Description 电器工厂类（抽象工厂模式）
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Date 2020-04-09 14:23
 * @Version 1.0
 **/
public interface ElectricApplianceFactory {

    IRefrigerator createRefrigerator();

    ITelevision createTelevision();

    IWashingMachine createWashingMachine();

}
