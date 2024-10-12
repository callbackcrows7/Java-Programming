import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
public class DistinctExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 30, 30, 40); 
        List<Integer> distinctNumbers = numbers.stream() 
                                        .distinct() 
                                        .collect(Collectors.toList()); 
        System.out.println(distinctNumbers); // Output: [10, 20, 30, 40] 
    } 
}