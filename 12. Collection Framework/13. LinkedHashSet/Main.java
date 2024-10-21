import java.util.LinkedHashSet; 

public class Main { 
    public static void main(String[] args) { 
        LinkedHashSet<String> set = new LinkedHashSet<>(); 
        set.add("Apple"); 
        set.add("Banana"); 
        set.add("Orange"); 

        System.out.println(set);  // Output: [Apple, Banana, Orange] 
      
        // Remove elements
        set.remove("Banana"); 
        System.out.println(set);  // Output: [Apple, Orange] 
    } 
}