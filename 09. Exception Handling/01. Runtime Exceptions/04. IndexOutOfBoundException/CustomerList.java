import java.util.ArrayList;

public class CustomerList {
    public static void main(String[] args) {
        ArrayList<String> customer = new ArrayList<>();

        customer.add("John Doe");
        customer.add("Jane Smith");
        customer.add("Bob Johnson");

        try {
            System.out.println("Customer at position 5: " + customer.get(5)); // Invalid Index (Throw IndexOutOfBoundsException)
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid customer index");
        }
    }
}