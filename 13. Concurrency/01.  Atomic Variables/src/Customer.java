import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
    // Static AtomicInteger to ensure unique ID across all Customer instances
    private static final AtomicInteger idCounter = new AtomicInteger(1);

    // Instance fields
    private final int id; // Immutable once assigned
    private String name;
    private String email;

    // Constructor: Auto-assigns a unique ID
    public Customer(String name, String email) {
        this.id = idCounter.getAndIncrement();
        this.name = name;
        this.email = email;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Overriding toString() for better print representation
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
