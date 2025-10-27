package vehicles;

public class Car extends WheeledVehicle {
    String fuelType;

    public Car(String color, int numberOfWheels, String fuelType) {
        super(color, numberOfWheels);

        this.fuelType = fuelType;
    }

}
