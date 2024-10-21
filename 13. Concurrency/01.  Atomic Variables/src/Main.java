public class Main {
    public static void main(String[] args) {
        // Creating Customer objects
        Customer c1 = new Customer("Alice", "alice@example.com");
        Customer c2 = new Customer("Bob", "bob@example.com");

        // Displaying customer details
        System.out.println(c1);
        System.out.println(c2);

        // Modifying customer information
        c1.setName("Alice Johnson");
        c1.setEmail("alice.j@example.com");

        // Displaying updated customer details
        System.out.println("Updated Customer: " + c1);
    }
}