import java.util.function.Predicate;

public class PredicateOrEcample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0; 
        Predicate<Integer> isNegative = (n) -> n < 0; 
         
       
        boolean result = isEven.or(isNegative).test(-3);
         
        System.out.println(result);  // Output: true
    }
}
