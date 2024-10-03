import java.io.IOException;
import java.util.Scanner;
// Create a new public class called isPrime
public class calculateFact{
    // Create a main method where the program will start.
    public static void main(String[] args) {
        // Create a new scanner to read the user input
        char ch = 'q';
        int i = 0;
        String line = "";
        Scanner scanner = new Scanner(System.in);

        // Define needed variables for the program.
        double num, result;
        char input;

        do {
            // Read the number from the user input
            while (true) {
                System.out.print("Please enter a number: ");
                // Check if the next input in the scanner is a valid number or not.
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Input must be a numeric (Double) value.");
                    scanner.next(); // Clean invalid input
                } else {
                    num = scanner.nextDouble();
                    scanner.nextLine(); // Clear the buffer after reading the valid input.
                    break;
                }
            }

            clearConsole(); // Clear the current console.

            // Calculate factorial of the number and stor it into result variable
            result = calculateFactorial(num);

            // Display the result
            System.out.printf("%.2f! = %.2f\n", num, result);

            // Ask if the user wants to continue or quit the program
            System.out.print("Do you want to continue? (y/n): ");
            input = scanner.next().toLowerCase().charAt(0);

            clearConsole(); // Clear the current console.
        } while (input != 'n'); // Program continue until 'n' is pressed.

        System.out.println("Program terminated successfully.");
        scanner.close(); // Close the scanner.
    }
    // Method to clear the current console
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } catch (IOException | InterruptedException e) {
            System.err.println("Failed to clear the current console.");
        }
    }

    // Method to calculate factorial of a number.
    public static double calculateFactorial(double number) {
        double fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }
    
}