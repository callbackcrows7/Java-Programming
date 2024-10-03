import java.io.IOException;
import java.util.Scanner;
// Create a new public class (spelling)
public class spelling {
    // Create a main method where the program will start.
    public static void main(String[] args) {
        // Create a scanner for reading the user's input.
        Scanner scanner = new Scanner(System.in);
        
        char input;
        do {
            // Set and display program name.
            System.out.println("Spelling Number");
            System.out.println("---------------");
            System.out.println(); // Generate a new line.

            // Get an integer number from user with validations.
            int digit;
            while (true) {
                System.out.print("Please enter an integer number between 0 and 9: ");
                // Check if the next input in the scanner is a valid integer number.
                if (scanner.hasNextInt()) {
                    digit = scanner.nextInt();
                    // Check if the number positive or negative.
                    if (digit >= 0) {
                        break;
                    } else {
                        System.out.println("Invalid Number. Input must be a positive number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer number");
                }
                scanner.nextLine(); // Clear invalid input or new line character.
            }

            scanner.nextLine(); // Clear the newline character left by nextInt()
            clearConsole(); // Clear the current console.

            // Print the spelling of the number
            spellingNumber(digit);

            // Ask if the user wants to continue or quit.
            System.out.print("Press do you went to continue? (y/n): ");
            input = scanner.next().toLowerCase().charAt(0);
            clearConsole(); // Clear the current console.
        } while (input != 'n'); // program will continue until 'n' is pressed.

        System.out.println("Program Terminated.");
        scanner.close(); // Close the scanner.
    }
    // Method to display the spelling of a number
    public static void spellingNumber(int x) {
        switch (x) {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;
            
            case 4:
                System.out.println("Four");
                break;
            
            case 5:
                System.out.println("Five");
                break;

            case 6:
                System.out.println("Six");
                break;

             case 7:
                System.out.println("Seven");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;
        
            default:
                System.out.println("Invalid input. ");
                break;
        }
    }

    // Method to clear the current console.
    public static void clearConsole() {
        try {
            // Create a new process to execute the "cls" command.
            ProcessBuilder processbuilder = new ProcessBuilder("cmd", "/c", "cls");

            // Redirect the output of the process to the current console
            processbuilder.inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}