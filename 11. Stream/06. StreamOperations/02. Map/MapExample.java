import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
public class MapExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
        List<Integer> doubledNumbers = numbers.stream() 
                                        .map(n -> n * 10) 
                                        .collect(Collectors.toList()); 
        System.out.println(doubledNumbers); // Output: [10, 20, 30, 40, 50] 
    } 
} 