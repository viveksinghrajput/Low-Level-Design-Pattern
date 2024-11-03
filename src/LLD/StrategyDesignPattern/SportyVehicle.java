package LLD.StrategyDesignPattern;


import LLD.StrategyDesignPattern.strategy.SpecialDrive;

public class SportyVehicle extends Vehicle {

    SportyVehicle(){
        super(new SpecialDrive());
    }
}
