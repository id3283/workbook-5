package vehicles;

public class WheeledVehicle extends Vehicle{
    int numberOfWheels;

//    public WheeledVehicle() {
//        super("black");
//    }

    public WheeledVehicle(String color, int wheels) {
        super(color);
        this.numberOfWheels = wheels;
    }
}
