import java.util.function.Predicate;

public class PredicateInterfaceExample {
    public static void main(String[] args) {
        Predicate<String>startsWith = (str) -> str.startsWith("Hello");
        boolean result = startsWith.test("Hello World!");

        System.out.println("Result: " + result);
    }
}