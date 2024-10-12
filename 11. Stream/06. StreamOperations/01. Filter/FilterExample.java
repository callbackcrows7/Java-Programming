import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
public class FilterExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30); 
        List<Integer> lessThan30 = numbers.stream() 
                                        .filter(n -> n < 30) 
                                        .collect(Collectors.toList()); 
        System.out.println(lessThan30); // Output: [10, 15, 20, 25] 
    } 
} 