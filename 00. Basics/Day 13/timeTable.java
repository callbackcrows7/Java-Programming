import java.util.Scanner;
import java.io.IOException;

// Create a new public class timeTable
public class timeTable {
    // Create a main method where the program will start
    public static void main(String[] args) {
        // Create a scanner to scan the user input.
        Scanner scanner = new Scanner(System.in);

        // Define the necessary variables for the program.
        int num;
        char input;

        do {
            // Get number from the user.
            while (true) {
                System.out.print("Please enter an integer number: ");
                // Check if the next input in the scanner is a valid integer number or not.
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a numeric integer value.");
                    scanner.next(); // Clear invalid input.
                } else {
                    num = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer after valid input.
                    break;
                }
            }

            clearConsole(); // Clear the current console.

            // Generate time table and print it to the screen.
            generateTimeTable(num);

           // Ask if the user wants to continue or quit.
           System.out.print("Enter 'q' to quit, or any other key to continue: "); 
           input = scanner.next().toLowerCase().charAt(0);

           clearConsole(); // clear the current console.
        } while (input != 'q'); // Program will continue until 'q' is pressed.

        System.out.println("Program terminated successfully");
        scanner.close(); // Close the scanner.
    }

    // Method to clear the current console.
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

    // Method to generate time table.
    public static void generateTimeTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
        System.out.println(); // generate a new line.
    }
}