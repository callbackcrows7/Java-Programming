import java.util.function.Predicate;

public class PredicateAndExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0; 
        Predicate<Integer> isPositive = (n) -> n > 0; 
         
      
        boolean result = isEven.and(isPositive).test(4);
         
        System.out.println(result);  // Output: true 
    }
}
