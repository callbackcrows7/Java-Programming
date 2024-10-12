import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
public class SortedExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(40, 10, 30, 20, 50); 
        List<Integer> sortedNumbers = numbers.stream()
                                        .sorted() 
                                        .collect(Collectors.toList()); 
        System.out.println(sortedNumbers); // Output: [10, 20, 30, 40, 50] 
    } 
}