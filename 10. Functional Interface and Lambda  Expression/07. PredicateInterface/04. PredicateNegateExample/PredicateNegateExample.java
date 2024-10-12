import java.util.function.Predicate;

public class PredicateNegateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0; 
         
        boolean result = isEven.negate().test(4);
         
        System.out.println(result);  // Output: false
    }
}
