public class Bike extends Vehicle {
    private int engineCapacity;
    private int topSpeed;

    public Bike(String type, String make, String model, String color, double price, int engineCapacity, int topSpeed) {
        super(type, make, model, color, price);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Bike Type: " + getType());
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}