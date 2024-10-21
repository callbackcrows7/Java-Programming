import java.util.TreeMap; 
  
public class Main { 
    public static void main(String[] args) { 
        TreeMap<String, Integer> map = new TreeMap<>(); 
        map.put("Banana", 80); 
        map.put("Apple", 100); 
        map.put("Mango", 120); 
  
        System.out.println(map);  // Output: {Apple=100, Banana=80, Mango=120} 
  
        // Accessing first and last key value
        System.out.println("First Entry: " + map.firstEntry());  // Output: First Entry: Apple=100 
        System.out.println("Last Entry: " + map.lastEntry());    // Output: Last Entry: Mango=120 
    } 
} 