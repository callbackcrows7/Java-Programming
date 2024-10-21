import java.util.Hashtable; 
  
public class Main { 
    public static void main(String[] args) { 
        Hashtable<String, Integer> table = new Hashtable<>(); 
        table.put("Apple", 100); 
        table.put("Banana", 80); 
  
        System.out.println(table);  // Output: {Banana=80, Apple=100} 
  
        // Remove an entry from the table
        table.remove("Banana"); 
        System.out.println(table);  // Output: {Apple=100} 
    } 
} 