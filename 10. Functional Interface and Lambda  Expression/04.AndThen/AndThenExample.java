import java.util.function.Function;

public class AndThenExample {
    public static void main(String[] args) {
        
        Function<Integer, Double> dividedByThree = (num) -> num / 3.0;
        Function<Double, Double> subtractByTwo = (num) -> num - 2;

        Function<Integer, Double> combinedFunction = dividedByThree.andThen(subtractByTwo);

        double result = combinedFunction.apply(9);

        System.out.println("Result: " + result);
    }
}
