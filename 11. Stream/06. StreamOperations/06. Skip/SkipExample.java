import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 

public class SkipExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50); 
        List<Integer> skippedNumbers = numbers.stream() 
                                        .skip(2) 
                                        .collect(Collectors.toList()); 
        System.out.println(skippedNumbers); // Output: [30, 40, 50] 
    } 
}