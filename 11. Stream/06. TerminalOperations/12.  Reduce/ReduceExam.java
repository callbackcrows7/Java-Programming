import java.util.Arrays; 
import java.util.List; 
import java.util.Optional; 
  
public class ReduceExam { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
  
        // Optional return 
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b); 
        sum.ifPresent(s -> System.out.println("Sum: " + s)); // Output: 15 
  
        // Initial value সহ 
        int product = numbers.stream().reduce(1, (a, b) -> a * b); 
        System.out.println("Product: " + product); // Output: 120 
    } 
} 
  
