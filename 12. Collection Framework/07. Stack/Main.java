import java.util.Stack; 

public class Main { 
    public static void main(String[] args) { 
        Stack<String> stack = new Stack<>(); 

        stack.push("Apple"); 
        stack.push("Banana"); 

        System.out.println(stack.peek());  // Output: Banana 

        stack.pop(); 
        System.out.println(stack);  // Output: [Apple] 

        System.out.println(stack.isEmpty());  // Output: false 
    } 
}