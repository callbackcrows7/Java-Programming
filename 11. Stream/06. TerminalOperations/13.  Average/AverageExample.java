import java.util.OptionalDouble; 
import java.util.stream.IntStream;

public class AverageExample { 
    public static void main(String[] args) { 
        IntStream numbers = IntStream.of(1, 2, 3, 4, 5); 
        OptionalDouble average = numbers.average(); 

        average.ifPresent(avg -> System.out.println("Average: " + avg)); // Output: 3.0 
    } 
}
