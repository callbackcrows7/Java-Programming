import java.util.Arrays; 
import java.util.List; 
import java.util.Optional; 
  
public class MinMaxExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50); 
  
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo); 
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo); 
  
        minNumber.ifPresent(min -> System.out.println("Minimum: " + min)); // Output: 10 
        maxNumber.ifPresent(max -> System.out.println("Maximum: " + max)); // Output: 50 
    } 
}