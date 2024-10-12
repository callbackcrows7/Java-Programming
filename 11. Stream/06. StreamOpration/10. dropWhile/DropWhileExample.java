import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 

public class DropWhileExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 80, 90); 
        List<Integer> result = numbers.stream() 
                                .dropWhile(n -> n < 75) 
                                .collect(Collectors.toList()); 
        System.out.println(result); // Output: [80, 90] 
    } 
} 