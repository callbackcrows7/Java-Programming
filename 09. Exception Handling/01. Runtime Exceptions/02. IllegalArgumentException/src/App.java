public class App {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount(500);

        try {
            account.deposit(-1000);
        
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
