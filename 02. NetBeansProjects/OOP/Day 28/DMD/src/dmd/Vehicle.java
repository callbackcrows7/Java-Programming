package dmd;

/**
 *
 * @author CBC7
 */
public class Vehicle {
    
    private String vehicleType;
    private String brand;
    private String model;
    private String color;
    private float weight;
    
    public Vehicle(String vehicleType, String brand, String model, String color, float weight) {
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }
    
    public void displayAttribute() {
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    }
}
