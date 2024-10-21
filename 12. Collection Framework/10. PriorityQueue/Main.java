import java.util.PriorityQueue; 

public class Main { 
    public static void main(String[] args) { 
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        pq.add(10); 
        pq.add(20); 
        pq.add(15); 

        System.out.println(pq.peek());  // Output: 10 

        // remove element
        pq.poll(); 
        System.out.println(pq);  // Output: [15, 20] 
    } 
}