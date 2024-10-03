public class App {
    public static void main(String[] args) throws Exception {
        MobileUser user; // Creating a reference variable.

        user = new userOne(); // Initializing the reference variable with the userOne subclass.
        user.sendMessage();

        user = new userTwo();// Initializing the reference variable with the userOne subclass.
        user.sendMessage();
    }
}
