public class BankAccount {
    private double balance;

    // Construct
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        } else {
            balance += amount;
            System.out.println("Deposit successful! Current balance: " + balance);
        }
    }
}
