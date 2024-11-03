package LLD.StrategyDesignPattern;

import LLD.StrategyDesignPattern.strategy.DriveInterface;

public class Vehicle {

    private DriveInterface driveInterface;

    Vehicle(DriveInterface di){
        this.driveInterface =di;
    }

    public void drive(){
        driveInterface.drive();
    }
}
