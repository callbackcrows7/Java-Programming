import java.util.Arrays; 
import java.util.List; 
  
public class CountExam { 
    public static void main(String[] args) { 
        List<Integer> stream = Arrays.asList(10, 20, 30, 40, 50); 
        long itemCount = stream.stream().count(); 
        System.out.println(itemCount); // Output: 5 
    } 
} 