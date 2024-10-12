import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
  
public class FlatMapExample { 
    public static void main(String[] args) { 
        List<List<String>> nestedList = Arrays.asList( 
            Arrays.asList("a", "b"), 
            Arrays.asList("c", "d") 
        ); 
  
        List<String> flatList = nestedList.stream() 
                                          .flatMap(List::stream) 
                                          .collect(Collectors.toList()); 
  
        System.out.println(flatList); // Output: [a, b, c, d] 
    } 
} 