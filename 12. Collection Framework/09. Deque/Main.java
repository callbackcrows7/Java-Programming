import java.util.Deque; 
import java.util.LinkedList; 
  
public class Main { 
    public static void main(String[] args) { 
        Deque<String> deque = new LinkedList<>(); 
        deque.addFirst("Apple"); 
        deque.addLast("Banana"); 
        deque.addFirst("Orange"); 
  
        System.out.println(deque);  // Output: [Orange, Apple, Banana] 
  
        // remove first and last elements
        deque.removeFirst(); 
        deque.removeLast(); 
        System.out.println(deque);  // Output: [Apple] 
    } 
} 