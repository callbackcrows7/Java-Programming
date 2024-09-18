package dmd;

/**
 *
 * @author CBC7
 */
public class Bike extends Vehicle{
    
    private float wheelSize;
    
    public Bike(String vehicleType, String brand, String model, String color, float weight, float wheelSize) {
        super(vehicleType, brand, model, color, weight);
        this.wheelSize = wheelSize;
    }

    public float getWheelSize() {
        return wheelSize;
    }
    
    @Override
    public void displayAttribute() {
        super.displayAttribute();
        System.out.println("Wheel Size: "+wheelSize);
    }
}
