import java.util.Arrays; 
import java.util.List; 
  
public class ParallelFilterExample { 
    public static void main(String[] args) { 
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100); 
  
        numbers.parallelStream() 
               .filter(n -> n > 50) 
               .forEach(n -> System.out.println("Number: " + n)); 

    } 
}