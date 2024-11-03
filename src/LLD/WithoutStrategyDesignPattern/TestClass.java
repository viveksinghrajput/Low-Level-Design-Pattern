package LLD.WithoutStrategyDesignPattern;

public class TestClass {
    public static void main(String[] args) {
        SportyVehicle sportyVehicle = new SportyVehicle();
        sportyVehicle.drive();

        PassangerVehicle passangerVehicle = new PassangerVehicle();
        passangerVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
