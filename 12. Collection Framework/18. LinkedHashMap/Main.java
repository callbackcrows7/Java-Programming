import java.util.LinkedHashMap; 
  
public class Main { 
    public static void main(String[] args) { 
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); 
        map.put("Apple", 100); 
        map.put("Banana", 80); 
        map.put("Orange", 90); 
  
        System.out.println(map);  // Output: {Apple=100, Banana=80, Orange=90} 
  
        // Remove an entry from the linkedHashMap
        map.remove("Banana"); 
        System.out.println(map);  // Output: {Apple=100, Orange=90} 
    } 
}