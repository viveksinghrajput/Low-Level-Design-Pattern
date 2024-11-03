package LLD.StrategyDesignPattern.strategy;

public class SpecialDrive implements DriveInterface {
    @Override
    public void drive() {
        System.out.println("Special drive ........");
    }
}
