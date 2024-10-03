import java.util.Scanner;
import java.io.IOException;
// Create a public class (AreaOfTriangle)
public class AreaOfTriangle{
    // Create a main method where the program will start
    public static void main(String[] args) {
        // Create a scanner to read the data from user.
        Scanner scanner = new Scanner(System.in);

        String input = "";
        while (!input.equalsIgnoreCase("n")) {
            System.out.println("Triangle Area Calculator");
            System.out.println("------------------------");
            System.out.println(); // Create a new line.

            // Read the first side of the triangle.
            float fSide;
            while (true) {
                System.out.print("Please enter the first side of the triangle: ");
                // Check if the next input in the scanner is valid float or not.
                if (scanner.hasNextFloat()) {
                    fSide = scanner.nextFloat();
                    // Check if first Side input is valid or not.
                    if (fSide > 0) {
                        break;
                    } else {
                        System.out.println("Invalid input. First side must be a positive number.");
                    }   
                } else {
                    System.out.println("Invalid input. Please enter a floating point number.");
                }
                scanner.nextLine(); // Clear the invalid input or newline character.
            }
            scanner.nextLine(); // Clear the newline left by nextFlat().

            // Read the Second Side of the triangle.
            float sSide;
            while (true) {
                System.out.print("Please enter the second side of the triangle: ");
                // Check if the next input in the scanner is a valid float or not.
                if (scanner.hasNextFloat()) {
                    sSide = scanner.nextFloat();
                    // Check if second side input is valid or not.
                    if (sSide > 0) {
                        break;
                    } else {
                        System.out.println("Invalid input. Second side must be a positive number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a floating point number.");
                }
                scanner.nextLine(); // Clean the invalid input or new line character.
            }
            scanner.nextLine(); // Clean the new line left by nextFloat();

            // Read the Second Side of the triangle.
            float tSide;
            while (true) {
                System.out.print("Please enter the third side of the triangle: ");
                // Check if the next input in the scanner is a valid float or not.
                if (scanner.hasNextFloat()) {
                    tSide = scanner.nextFloat();
                    // Check if second side input is valid or not.
                    if (tSide > 0) {
                        break;
                    } else {
                        System.out.println("Invalid input. Third side must be a positive number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a floating point number.");
                }
                scanner.nextLine(); // Clean the invalid input or new line character.
            }
            scanner.nextLine(); // Clean the new line left by nextFloat();
            clearConsol(); // Clear the current console.

            // Calculate the s
            float s  = (fSide + sSide + tSide) / 2.0f;

            // Calculate the area of the triangle.
            double area = Math.sqrt(s * (s - fSide) * (s - sSide) * (s - tSide)); 

            // Display area of the triangle.
            System.out.println("The area of the triangle is: " + area);
            System.out.println(); // Create a new line.

            // Ask if the user wants to continue or quit.
            System.out.print("Do you want to continue? (y/n): ");
            input = scanner.next(); 
            clearConsol(); // Clear the current consol.
        }
        System.out.println("Program Terminated");
        scanner.close(); // Close the scanner
    }
    // Method to clear console output
    public static void clearConsol() {
        try {
            // Create a new process to execute the "cls" command
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");

            // Redirect the output of the process to the current console.
            pb.inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}