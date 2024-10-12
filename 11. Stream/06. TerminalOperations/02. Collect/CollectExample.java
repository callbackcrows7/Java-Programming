import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
  
public class CollectExample { 
    public static void main(String[] args) { 
        List<String> namesStream = Arrays.asList("Rahim", "Karim", "Salam"); 
        List<String> namesList = namesStream.stream() 
                                           .collect(Collectors.toList()); 
        System.out.println(namesList); // Output: [Rahim, Karim, Salam] 
    } 
} 