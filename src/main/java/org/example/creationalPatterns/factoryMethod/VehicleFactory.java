package org.example.creationalPatterns.factoryMethod;

public class VehicleFactory {
    public Vehicle createVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("bicycle")) {
            return new Bicycle();
        }
        else {
            return  new Car();
        }
    }
}
