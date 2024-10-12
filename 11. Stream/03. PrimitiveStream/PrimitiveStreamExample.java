import java.util.stream.IntStream; 
  
public class PrimitiveStreamExample { 
    public static void main(String[] args) { 
        IntStream.range(1, 10).forEach(System.out::println); // print 1 to 9
        System.out.println();
        IntStream.rangeClosed(1, 10).forEach(System.out::println); // print 1 to 10
    } 
} 