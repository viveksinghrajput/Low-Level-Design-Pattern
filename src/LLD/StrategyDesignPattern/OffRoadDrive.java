package LLD.StrategyDesignPattern;

import LLD.StrategyDesignPattern.strategy.NormalDrive;

public class OffRoadDrive extends Vehicle{
    OffRoadDrive() {
        super(new NormalDrive());
    }
}
