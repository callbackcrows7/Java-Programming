import java.io.IOException;
import java.util.Scanner;

// Create a new public class (simpleCalculator)
public class gcdAndLcm{
    // Create a public main method where the program will start.
    public static void main(String[] args) throws IOException{
        // Create a Scanner for get users input.
        Scanner scanner = new Scanner(System.in);

        // Define needed variables for the program or calculations
        double numOne, numTwo, gcd, lcm;
        char input;

        do {
            // Loop to ensure a valid first number is entered
            while (true) {
                System.out.print("Please enter first number: ");
                // Check if the next input in the scanner is a valid numeric value or not.
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid number. Please enter a numeric value.");
                    scanner.next(); // Clear invalid input.
                } else {
                    numOne = scanner.nextDouble();
                    scanner.nextLine(); // Clear the buffer after valid input
                    break;
                }
            }

            // Loop to ensure a valid second number is entered
            while (true) {
                System.out.print("Please enter second number: ");
                // Check if the next input in the scanner is a valid numeric value or not.
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid number. Please enter a numeric value.");
                    scanner.next(); // Clear invalid input.
                } else {
                    numTwo = scanner.nextDouble();
                    scanner.nextLine(); // Clear the buffer after valid input.
                    break;
                }
            }
            
            clearConsole(); // clear the current console.

            // Calculate GCD and print it to the screen.
            gcd = calculateGcd(numOne, numTwo);
            System.out.println("GCD: " + gcd);

            // Calculate LCM and print it to the screen.
            lcm = calculateLcm(numOne, numTwo);
            System.out.println("Lcm: " + lcm);

            // Ask if the user wants to continue or quit.
            System.out.print("Enter 'q' to quit or any other to continue: ");
            input = scanner.next().toLowerCase().charAt(0);

            clearConsole(); // Clear the current console.

        } while (input != 'q'); // The program will continue until the q is pressed.

        System.out.println("Program terminated successfully.");
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
            System.err.println("Failed to clear the console.");
        }
    }

    // Method to calculate gcd
    public static double calculateGcd(double x, double y) {
        double rem;
        while (y != 0) {
            rem = x % y;
            x = y;
            y = rem;
        }
        return x;
    }

    // Method to calculate lcm
    public static double calculateLcm(double x, double y) {
        return (x * y) / calculateGcd(x, y);
    }

}