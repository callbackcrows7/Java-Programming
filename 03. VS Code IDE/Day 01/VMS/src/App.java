public class App {
    public static void main(String[] args) throws Exception {
        Vehicle[] vehicle1 = new Vehicle[2];

        vehicle1[0] = new Car("Private Car", "BMW", "X05", "Silver", 25000000, 2500, "Automatic", "Petrol", 15.5);
        vehicle1[1] = new Bike("Super Bike", "KAWASAKI NINJA", "H2R", "Black", 10000000, 1000, 250);

        for (Vehicle v : vehicle1) {
            v.displayVehicleDetails();
            System.out.println();
        }
    }
}