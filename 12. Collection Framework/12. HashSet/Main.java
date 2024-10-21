import java.util.HashSet; 

public class Main { 
    public static void main(String[] args) { 
        HashSet<String> set = new HashSet<>(); 
        set.add("Apple"); 
        set.add("Banana"); 
        set.add("Apple");  // Does not add duplicates elements

        System.out.println(set);  // Output: [Banana, Apple] 

        // Remove elements
        set.remove("Banana"); 
        System.out.println(set);  // Output: [Apple] 

        // Check elements
        System.out.println(set.contains("Apple"));  // Output: true 
    } 
} 