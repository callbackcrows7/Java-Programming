import java.util.Arrays; 
import java.util.List; 
import java.util.Optional; 

public class FindExample { 
    public static void main(String[] args) { 
        List<String> names = Arrays.asList("Rahim", "Karim", "Salam"); 

        Optional<String> firstName = names.stream().findFirst(); 
        Optional<String> anyName = names.stream().findAny(); 
        
        firstName.ifPresent(name -> System.out.println("First Name: " + name)); // Output: Rahim 
        anyName.ifPresent(name -> System.out.println("Any Name: " + name)); // Output: (could be any name) 
    } 
}