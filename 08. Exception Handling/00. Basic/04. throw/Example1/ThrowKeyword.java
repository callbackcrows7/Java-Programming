public class ThrowKeyword {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
    }
}