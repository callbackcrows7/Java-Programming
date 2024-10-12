import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a, b) -> a * b; 
        System.out.println(multiply.apply(3, 4)); // Output: 12
    }
}
