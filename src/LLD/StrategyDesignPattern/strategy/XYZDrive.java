package LLD.StrategyDesignPattern.strategy;

public class XYZDrive implements DriveInterface {
    @Override
    public void drive() {
        System.out.println("xyz drive......");
    }
}
