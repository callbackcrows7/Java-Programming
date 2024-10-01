
package dmd;

/**
 *
 * @author CBC7
 */
public class Car extends Vehicle {
    private String engineType;
    private String gearType;
    private float price;
    
    public Car(String vehicleType, String brand, String model, String color, float weight, String engineType, String gearType, float price) {
        super(vehicleType, brand, model, color, weight);
        this.engineType = engineType;
        this.gearType = gearType;
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getGearType() {
        return gearType;
    }

    public float getPrice() {
        return price;
    }
    
    @Override
    public void displayAttribute() {
        super.displayAttribute();
        System.out.println("Engine Type: "+engineType);
        System.out.println("Gear Type: "+gearType);
        System.out.println("Price: "+price);
    }
    
}
