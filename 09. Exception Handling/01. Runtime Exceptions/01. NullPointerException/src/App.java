public class App {
    public static void main(String[] args) throws Exception {
        UserProfile user = new UserProfile("John", null);

        try {
            System.out.println("User's email domain: " + user.getEmailDomain());
        } catch (NullPointerException e) {
            System.out.println("Error: User email is missing! Cannot fetch domain." + e.getMessage());
        }
    }
}
