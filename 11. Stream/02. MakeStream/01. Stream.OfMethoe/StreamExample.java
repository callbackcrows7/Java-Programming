import java.util.stream.Stream; 
  
public class StreamExample { 
    public static void main(String[] args) { 
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5); 
        numbers.forEach(System.out::println); // Output 1, 2, 3, 4, 5
    } 
}