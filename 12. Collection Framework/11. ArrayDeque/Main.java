import java.util.ArrayDeque; 

public class Main { 
    public static void main(String[] args) { 
        ArrayDeque<String> deque = new ArrayDeque<>(); 
        deque.addFirst("Apple"); 
        deque.addLast("Banana"); 
        deque.addFirst("Orange"); 

        System.out.println(deque);  // Output: [Orange, Apple, Banana] 

        // Remove 1st and last element
        deque.removeFirst(); 
        deque.removeLast(); 
        System.out.println(deque);  // Output: [Apple] 
    } 
}