import java.util.Vector; 

public class Main { 
    public static void main(String[] args) { 
        Vector<String> vector = new Vector<>(); 
        vector.add("Apple"); 
        vector.add("Banana"); 

        System.out.println(vector.get(0));  // Output: Apple 
        
        vector.remove(1); 
        System.out.println(vector);  // Output: [Apple] 
    } 
}