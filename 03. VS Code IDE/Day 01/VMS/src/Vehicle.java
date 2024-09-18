public abstract class Vehicle {

    private String type;
    private String make;
    private String model;
    private String color;
    private double price;

    public Vehicle(String type, String make, String model, String color, double price) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public abstract void displayVehicleDetails();

    // Getters for the fields
    public String getType() { return type; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
}