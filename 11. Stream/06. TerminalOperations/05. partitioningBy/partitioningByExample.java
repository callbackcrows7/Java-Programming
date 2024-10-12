import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partitioningByExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25); 
        Map<Boolean, List<Integer>> partitioned = numbers.stream() 
                                                    .collect(Collectors.partitioningBy(n -> n % 2 == 0)); 
        System.out.println(partitioned); // Output: {false=[15, 25], true=[10, 20]} 
    }
}
