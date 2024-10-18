import java.util.LinkedList; 
import java.util.Queue; 
  
public class Main { 
    public static void main(String[] args) { 
        Queue<String> queue = new LinkedList<>(); 
        queue.add("Apple"); 
        queue.add("Banana"); 
        queue.add("Orange"); 
  
        // Print first element of queue
        System.out.println(queue.peek());  // Output: Apple 
  
        // remove first element 
        queue.poll(); 
        System.out.println(queue);  // Output: [Banana, Orange] 
  
        // Check if queue is empty 
        System.out.println(queue.isEmpty());  // Output: false 
    } 
} 
 