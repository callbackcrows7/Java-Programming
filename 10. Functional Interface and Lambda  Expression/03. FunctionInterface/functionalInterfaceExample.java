import java.util.function.Function;

public class functionalInterfaceExample {
    public static void main(String[] args) {
        Function<Integer, Double> dividedByThree = (num) -> num / 3.0;
        double result = dividedByThree.apply(9);

        System.out.println("Result: " + result);
    }
}
