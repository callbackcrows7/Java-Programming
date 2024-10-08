public class App {
    public static void main(String[] args) {
        EcommerceOrder order = new EcommerceOrder(500);

        try {
            double discount = order.calculateDiscount(0);
            System.out.println("Final price after discount: " + discount);
        } catch (ArithmeticException e) {
            System.out.println("Error: Discount percentage cannot be zero.");
        }
    }
}
