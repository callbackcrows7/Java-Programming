import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
public class LimitExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50); 
        List<Integer> limitedNumbers = numbers.stream() 
                                        .limit(3) 
                                        .collect(Collectors.toList()); 
        System.out.println(limitedNumbers); // Output: [10, 20, 30] 
    }
} 