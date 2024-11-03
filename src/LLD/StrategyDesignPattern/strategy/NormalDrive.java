package LLD.StrategyDesignPattern.strategy;

public class NormalDrive implements DriveInterface {
    @Override
    public void drive() {
        System.out.println("normal drive ......");
    }
}
