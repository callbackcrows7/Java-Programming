import java.util.Arrays; 
import java.util.List; 
  
public class ToArrayExaample { 
    public static void main(String[] args) { 
        List<String> namesStream = Arrays.asList("Rahim", "Karim", "Salam"); 
        String[] namesArray = namesStream.stream().toArray(String[]::new); 
        System.out.println(Arrays.toString(namesArray)); // Output: [Rahim, Karim, Salam] 
    } 
}