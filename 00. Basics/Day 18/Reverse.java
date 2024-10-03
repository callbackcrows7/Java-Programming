import java.io.IOException;
import java.util.Scanner;


public class Reverse{
    public static void main(String[] args){
        // Create a scanner object from Scanner class
        Scanner scanner = new Scanner(System.in);
        int num;
        char input;

        do {
            while (true) {
                System.out.print("Enter a integer number: ");
                // Check if the next input in the scanner is a valid numeric value
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a numeric value.");
                    scanner.next(); // Consume the invalid input
                } else {
                    num = scanner.nextInt();
                    scanner.nextLine(); // clear the buffer after getting valid input
                    break;
                }
            }

            // Clear the current console output
            clearConsole();

            // Calculate  and display the reversed numbers
            System.out.println("Original number: " + num);
            reverse(num);

            // Ask user if they want to continue or not
            System.out.print("Do you want to continue? (y/n): ");
            input = scanner.next().toLowerCase().charAt(0);
            clearConsole(); // Clear the current console output

        } while (input != 'n'); // Program will continue until 'n' is pressed.
        System.out.println("Program terminated successfully.");
        scanner.close(); // Close the scanner object to release system resourcesout
    }

    // Method to reverse a number.
    public static void reverse(int num) {
        int sum, rem, temp = num;
        sum = 0;

        while (temp!= 0) {
            rem = temp % 10;
            sum = (sum * 10) + rem;
            temp = temp / 10;
        }
        System.out.println("Reversed number: " + sum);
    }

    // Method to clear th current console output
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } catch (IOException | InterruptedException e) {
            System.err.println("Failed to clear console!");
        }
    }
}