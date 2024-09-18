import java.io.IOException;
import java.util.Scanner;
// Create a new public class(AreaOfTriangle).
public class AreaOfTriangle {
    // Create a main method where the program will start.
    public static void main(String[] args) throws IOException {
        // Create a scanner for get input from user.
        Scanner scanner = new Scanner(System.in);

        char input;
        do {
            // Set program name
            System.out.println("Triangle Area Calculator");
            System.out.println("------------------------");
            System.out.println(); // Create a new line.

            // Get base of the triangle from user with validations
            float base;
            while (true) {
                System.out.print("Please enter base of the triangle: ");
                // Check if the next input in the scanner is a valid float or not.
                if (scanner.hasNextFloat()) {
                    base = scanner.nextFloat();
                    // Check if the base is a valid number or not.
                    if (base > 0) {
                        break;
                    } else {
                        System.out.println("Invalid input. Base must be a positive number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid floating point number.");
                }
                scanner.nextLine(); // Clear the invalid input or newline character.
            }

            scanner.nextLine(); // Clear the newline left by nextFlat().

            // Get height of the triangle from user with validations.
            float height;
            while (true) {
                System.out.print("Please enter height of the triangle: ");
                // Check if the next input in the scanner is a valid float or not.
                if (scanner.hasNextFloat()) {
                    height = scanner.nextFloat();
                    // Check if the height is valid number or not.
                    if (height > 0) {
                        break;
                    } else {
                        System.out.println("Invalid height. Height must be a positive number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid floating point number.");
                }
                scanner.nextLine(); // Clear the invalid input or newline character.
            }

            scanner.nextLine(); // Clear the newline left by nextFlat()
            clearConsole(); // Clear the current console.

            // Calculate the area of the triangle
            float area = (float)0.5 * (base * height);
            
            // Display the area of the triangle
            System.out.println("The area of the triangle is: " + area);
            System.out.println(); // Create a new line

            // Ask if the user wants to continue or quit.
            System.out.print("Press 'ESC' to  quit or any other key to continue: ");
            input = (char) System.in.read(); // Read the ASCII value directly from the input stream

            // Clear the newline character from the buffer
            while (System.in.read() != '\n');

            clearConsole();// Clear the current console.
        }  while (input != 27); // Program will continue until 'ESC' (ASCII 27) is pressed.

        System.out.println("Program Terminated");
        scanner.close();// Close the scanner
    }
    // Method to clear the console
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}