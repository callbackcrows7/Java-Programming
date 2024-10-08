public class EcommerceOrder {
    private double totalAmount;

    // Constructor
    public EcommerceOrder(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Method to calculate discount based on the total amount.
    public double calculateDiscount(double discountPercentage) {
        if (discountPercentage == 0){
            throw new ArithmeticException("Discount percentage cannot be zero."); // throw custom exception if discountPercentage equals 0.
        }
        return totalAmount - (totalAmount * (discountPercentage / 100));
    }
}
