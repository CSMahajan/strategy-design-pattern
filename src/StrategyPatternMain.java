import StrategyPattern.GoodsVehicle;
import StrategyPattern.OffRoadVehicle;
import StrategyPattern.SportsVehicle;
import StrategyPattern.Vehicle;

public class StrategyPatternMain {
    public static void main(String[] args) {
        Vehicle vehicleOffRoad = new OffRoadVehicle();
        vehicleOffRoad.drive();
        Vehicle vehicleGoods = new GoodsVehicle();
        vehicleGoods.drive();
        Vehicle vehicleSports = new SportsVehicle();
        vehicleSports.drive();
    }
}