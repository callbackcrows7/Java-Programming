
package superproject;

/**
 *
 * @author CBC7
 */
public class Vehicle {
    
    private String brand, model, color;
    private float weight;
    
    public Vehicle(String brand, String model, String color, float weight) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
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
        System.out.println("Brand: "+getBrand());
        System.out.println("Model: "+getModel());
        System.out.println("Color: "+getColor());
        System.out.println("Weight: "+getWeight());
    }
}
