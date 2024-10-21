import java.util.SortedSet; 
import java.util.TreeSet; 

public class Main { 
    public static void main(String[] args) { 
        SortedSet<Integer> set = new TreeSet<>(); 
        set.add(5); 
        set.add(1); 
        set.add(10); 
        System.out.println(set);  // Output: [1, 5, 10] 

        System.out.println("First: " + set.first());  // Output: First: 1 
        System.out.println("Last: " + set.last()); // Output: Last: 10 
    } 
} 