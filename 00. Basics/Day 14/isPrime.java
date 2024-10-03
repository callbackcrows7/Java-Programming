import java.io.IOException;
import java.util.Scanner;
// Create a new public class called isPrime
public class isPrime{
    // Create a main method where the program will start.
    public static void main(String[] args) {
        // Create a new scanner to read the user input
        Scanner scanner = new Scanner(System.in);

        // Define needed variables for the program.
        int num, count = 0;
        char input;

        do {
            // Read the number from the user input
            while (true) {
                System.out.print("Please enter an integer number: ");
                // Check if the next input in the scanner is a valid number or not.
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Input must be a numeric (integer) value.");
                    scanner.next(); // Clean invalid input
                } else {
                    num = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer after reading the valid input.
                    break;
                }
            }

            clearConsole(); // Clear the current console.

            // Check if the number is prime or not.
            count = checkPrime(num);

            // Calculate and display the result.
            calculatePrime(num, count);

            // Ask if the user wants to continue or quit the program
            System.out.print("Do you wnat to continue? (y/n): ");
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

    // Methods to check if the number is prime or not.
    public static int checkPrime(int number) {
        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                count++;
                break;
            }
        }
        return count;
    }

    // Method to calculate prime number
    public static void calculatePrime(int number, int count) {
        if (count == 0) {
            System.out.printf("%d is a prime number.\n", number);
        } else {
            System.out.printf("%d is not a prime number.\n", number);
        }
    }
}