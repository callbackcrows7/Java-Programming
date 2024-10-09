public class ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found: " + e.getMessage());
        }
    }
}