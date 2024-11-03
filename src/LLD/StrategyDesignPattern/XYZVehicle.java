package LLD.StrategyDesignPattern;

import LLD.StrategyDesignPattern.strategy.XYZDrive;

public class XYZVehicle extends Vehicle{

    XYZVehicle() {
        super(new XYZDrive());
    }
}
