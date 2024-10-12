import java.util.Arrays; 
import java.util.List; 
  
public class ForEachExample { 
    public static void main(String[] args) { 
        List<String> namesStream = Arrays.asList("Rahim", "Karim", "Salam"); 
        namesStream.forEach(System.out::println); // print each name 
    } 
} 
 