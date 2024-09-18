public class Car extends Vehicle {
    private int engineCapacity;
    private String transmission;
    private String fuelType;
    private double mileage;

    public Car(String type, String make, String model, String color, double price, int engineCapacity, String transmission, String fuelType, double mileage) {
        super(type, make, model, color, price);
        this.engineCapacity = engineCapacity;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Car Type: " + getType());
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println("Transmission: " + transmission);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
    }
}