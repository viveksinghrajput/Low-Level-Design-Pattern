package LLD.StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new XYZVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new SportyVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new OffRoadDrive();
        vehicle2.drive();
    }
}
