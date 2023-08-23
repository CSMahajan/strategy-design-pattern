package WithoutStrategyPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicleOffRoad = new OffRoadVehicle();
        vehicleOffRoad.drive();
        Vehicle vehicleGoods = new GoodsVehicle();
        vehicleGoods.drive();
        Vehicle vehicleSports = new SportsVehicle();
        vehicleSports.drive();
    }
}