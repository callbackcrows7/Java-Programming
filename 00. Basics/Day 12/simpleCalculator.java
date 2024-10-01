import java.io.IOException;
import java.util.Scanner;

// Create a new public class (simpleCalculator)
public class simpleCalculator{
    // Create a public main method where the program will start.
    public static void main(String[] args) throws IOException{
        // Create a Scanner for get users input.
        Scanner scanner = new Scanner(System.in);

        // Define needed variables for the program or calculations
        double numOne = 0, numTwo = 0;
        char operator;
        char input = ' ';

        //Display the Program name
        System.out.println("Simple Calculator");
        System.out.println("-----------------");
        System.out.println(); // Generate a new line.

        do {
            // Prompt user to enter operator
            System.out.print("Please enter an operator (+, -, *, /, %): ");
            operator = scanner.next().charAt(0);

            // Validate operator
            if (!validateOperator(operator)) {
                System.out.println("Invalid operator.");
                scanner.nextLine(); // Clear the invalid input.
                continue; // regenerate the if statement.
            }
            
            clearConsole(); // clear the current console.

            while (true) {
                // Loop to ensure a valid first number is entered
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

            while (true) {
                // Loop to ensure a valid second number is entered
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

            // Perform arithmetic operation based on the given operator and display it.
            performArithmeticOperation(operator, numOne, numTwo);

            // Ask if the user wants to continue or quit.
            System.out.print("Enter 'q' to quit or any other to continue: ");
            input = scanner.next().toLowerCase().charAt(0);

            clearConsole(); // Clear the current console.

        } while (input != 'q'); // The program will continue until the q is pressed.

        System.out.println("Program terminated successfully.");
        scanner.close(); // Close the scanner.
    }
    // Method to calculate sum of the two numbers.
    public static double calculateSum(double x, double y) {
        return x + y;
    }

    // Method to calculate sub of the two numbers.
    public static double calculateSub(double x, double y) {
        return x - y;
    }

    // Method to calculate Multiply of the two numbers.
    public static double calculateMulti(double x, double y) {
        return x * y;
    }

    // Method to calculate Division of the two numbers.
    public static double calculateDiv(double x, double y) {
        return x / y;
    }

    // Method to calculate Modules of the two numbers.
    public static double calculateMod(double x, double y) {
        return x % y;
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

    // Method to validate operators
    public static boolean validateOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%';
    }

    // Method to perform arithmetic operation based on the given operator.
    public static void performArithmeticOperation(char operator, double numOne, double numTwo) {
        switch (operator) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f\n", numOne, numTwo, calculateSum(numOne, numTwo));
                break;

            case '-':
                System.out.printf("%.2f + %.2f = %.2f\n", numOne, numTwo, calculateSub(numOne, numTwo));
                break;

            case '*':
                System.out.printf("%.2f + %.2f = %.2f\n", numOne, numTwo, calculateMulti(numOne, numTwo));
                break;

            case '/':
                if (numTwo == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.printf("%.2f + %.2f = %.2f\n", numOne, numTwo, calculateDiv(numOne, numTwo));
                }
                break;

            case '%':
                System.out.printf("%.2f + %.2f = %.2f\n", numOne, numTwo, calculateMod(numOne, numTwo));
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}