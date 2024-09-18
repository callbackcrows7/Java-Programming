
package superproject;

/**
 *
 * @author CBC7
 */
public class Car extends Vehicle {
    private String engineType;
    private String gearType;
    private float fuelCapacity;
    private double price;
    
    public Car(String brand, String model, String color, float weight, String engineType, String gearType, float fuelCapacity, double price) {
        super(brand, model, color, weight);
        this.engineType = engineType;
        this.gearType = gearType;
        this.fuelCapacity = fuelCapacity;
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getGearType() {
        return gearType;
    }

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public void displayAttribute () {
        super.displayAttribute();
        System.out.println("Engine Type: "+getEngineType());
        System.out.println("Gear Type: "+getGearType());
        System.out.println("Fuel Capacity: "+getFuelCapacity());
        System.out.println("Price: "+getPrice());
    }
}
