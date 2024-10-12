import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joiningExample {
    public static void main(String[] args) {
        List<String> titles = Arrays.asList("Java", "Python", "C++"); 
        
        String result = titles.stream().collect(Collectors.joining(", ")); 

        System.out.println(result); // Output: Java, Python, C++ 
    }
}
