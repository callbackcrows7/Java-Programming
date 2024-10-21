import java.util.TreeSet;

public class Main { 
    public static void main(String[] args) { 
        TreeSet<String> set = new TreeSet<>(); 
        set.add("Banana"); 
        set.add("Apple"); 
        set.add("Mango"); 
        System.out.println(set);  // Output: [Apple, Banana, Mango]

        System.out.println("First: " + set.first()); // Output: First: Apple 
        System.out.println("Last: " + set.last()); // Output: Last: Mango 
    } 
}