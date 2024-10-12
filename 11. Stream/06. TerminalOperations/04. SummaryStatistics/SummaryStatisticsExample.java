import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStatisticsExample {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(29.99, 49.99, 9.99); 
        DoubleSummaryStatistics stats = prices.stream() 
                                        .collect(Collectors.summarizingDouble(Double::doubleValue)); 
        System.out.println(stats); // Output: DoubleSummaryStatistics 
    }
}
