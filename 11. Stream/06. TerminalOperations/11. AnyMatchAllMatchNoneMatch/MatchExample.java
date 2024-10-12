import java.util.Arrays; 
import java.util.List; 

public class MatchExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        boolean anyGreaterThan40 = numbers.stream().anyMatch(n -> n > 40); 
        boolean allLessThan60 = numbers.stream().allMatch(n -> n < 60); 
        boolean noneEqualTo100 = numbers.stream().noneMatch(n -> n == 100); 
        
        System.out.println("Any greater than 40: " + anyGreaterThan40); // Output: true 
        System.out.println("All less than 60: " + allLessThan60); // Output: true 
        System.out.println("None equal to 100: " + noneEqualTo100); // Output: true 
    } 
}