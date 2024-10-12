import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
  
public class StreamExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6); 
  
        List<Integer> processedNumbers = numbers.stream()       // make stream 
                                                .filter(n -> n % 2 == 0)  // filter even number
                                                .map(n -> n * 2)          // multiply by 2
                                                .collect(Collectors.toList());  // collect all numbers 
         
        System.out.println(processedNumbers);  // Output: [4, 8, 12] 
    } 
}