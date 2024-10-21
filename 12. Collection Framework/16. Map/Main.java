import java.util.HashMap; 
import java.util.Map; 
  
public class Main { 
    public static void main(String[] args) { 
        Map<String, Integer> map = new HashMap<>(); 
        map.put("Apple", 100); 
        map.put("Banana", 80); 
        map.put("Apple", 120);  // Updated value of "Apple"
  
        System.out.println(map);  // Output: {Banana=80, Apple=120} 
  
        // Access value of "Apple"
        System.out.println(map.get("Apple"));  // Output: 120 
  
        // Remove an entry from the map
        map.remove("Banana"); 
        System.out.println(map);  // Output: {Apple=120} 
    } 
}