import java.io.IOException;
import java.util.Scanner;

class sumOfDigit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        char input;

        do {
            while(true) {
                System.out.print("Please enter a integer number: ");
                // Check if the next input in the scanner is a valid numeric value or not.
                if(!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a numeric value");
                    scanner.next(); // Discard the invalid input
                } else {
                    num = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer after valid input.
                    break;
                }
            }

            // Clear the current console
            clearConsole();

            // calculate the sum of digits of a number and display it.
            sumOfDigits(num);

            //  Asked if the user wants to continue or quit.
            System.out.print("Enter 'q' to quit or any key to continue: ");
            input = scanner.next().toLowerCase().charAt(0);
            clearConsole(); // Clear the current console

        } while(input != 'q'); // The program will continue until the q is pressed.

        System.out.println("Program terminated successfully.");
        scanner.close(); // Close the scanner.
    }

    // Method to clear the current console.
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033[H\033[j");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Failed to clear the console output.");
        }
    }

    // Method to calculate the sum of digits of a number and display it.
    public static void sumOfDigits(int num) {
        int temp = num;
        int sum = 0;
        int rem;
        while(temp!= 0) {
            rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}