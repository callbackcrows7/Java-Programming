import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Stream; 
public class CollectionStreamExample { 
    public static void main(String[] args) { 
        // Make stream from list
        List<String> namesList = Arrays.asList("Rahim", "Karim", "Salam"); 
        namesList.stream().forEach(System.out::println); 

        // make stream from array
        String[] namesArray = {"Rahim", "Karim", "Salam"}; 
        Arrays.stream(namesArray).forEach(System.out::println); 
    } 
}