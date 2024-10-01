// import Scanner package
import java.util.Scanner;

// Create a new class Calculator
public class Calculator{
    // Create a main method
    public static void main(String[] args) {
        // Define two float variables (x and y)
        float x, y;

        // Input two number from user and store them in x and y
        System.out.print("Please enter two non-negative numbers: ");
        Scanner sc = new Scanner(System.in);

        x = sc.nextFloat();
        y = sc.nextFloat();
        // Calculation x and y and print them
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }
}