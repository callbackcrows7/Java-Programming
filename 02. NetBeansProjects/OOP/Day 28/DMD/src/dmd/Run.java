package dmd;

/**
 *
 * @author CBC7
 */
public class Run {
    public static void main(String[] args) {
        Vehicle[] vehicle1 = new Vehicle[3];
        
        vehicle1[0] = new Vehicle("Super", "No brand", "No model", "No color", 0);
        vehicle1[1] = new Car("Car", "BMW", "X5", "Silver", 2500, "Patrol", "Semi-Auto", 25000000);
        vehicle1[2] = new Bike("Bike", "Ninja", "H2R", "Black", 250, 25.5f);
        
        for (int i = 0; i <= 2; i++) {
            vehicle1[i].displayAttribute();
            System.out.println();
        }
    }
}
