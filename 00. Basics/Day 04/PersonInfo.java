import java.io.IOException;
import java.util.Scanner;

// Create a public class (PersonInfo)
public class PersonInfo {
    // Create main method where the program will start
    public static void main(String[] args) {
        // Create a Scanner for get input from user
        Scanner scanner = new Scanner(System.in);

        // Get first name from user with validations
        String firstName;
        while (true) {
            System.out.print("Please enter your first name: ");
            firstName = scanner.nextLine().trim();
            // Check input validations
            if (firstName.matches("[a-zA-Z .]+")) {
                break;
            } else {
                System.out.println("Invalid input. First name should only contain letters, spaces, and dots.");
            }
        }

        // Get last name from user with validations
        String lastName;
        while (true) {
            System.out.print("Please enter your last name: ");
            lastName = scanner.nextLine().trim();
            // Check input validations
            if (lastName.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Invalid input. Last name should only contain letters.");
            }
        }

        // Get age from user with validations
        int age;
        while (true) {
            System.out.print("Please enter your age: ");
            // Check if the next input in the scanner is a valid integer or not
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                // Check age validations
                if (age > 0 && age <= 120) {
                    break;
                } else {
                    System.out.println("Invalid input. Age should be between 1 and 120.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer number.");
            }
            scanner.nextLine(); // Clear the invalid input or newline character
        }

        scanner.nextLine(); // Clear the newline left by nextInt()
       

        // Get job status from user with validations
        String jobStatus;
        while (true) {
            System.out.print("Please enter your job status: ");
            jobStatus = scanner.nextLine().trim();
            // Check age validations
            if (jobStatus.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid input. Job status should only contain letters and spaces.");
            }
        }

        // Get salary from user with validations
        float salary;
        while (true) {
            System.out.print("Please enter your salary: ");
            // Check if the next input in the scanner is a valid integer or not
            if (scanner.hasNextFloat()) {
                salary = scanner.nextFloat();
                // Check age validations
                if (salary >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Salary should be a non-negative number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
            }
            scanner.nextLine(); // Clear the invalid input or newline character
        }

        // Clear the current console
        clearConsole();

        // Display the collected information
        System.out.println("Details about the collected information");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Job Status: " + jobStatus);
        System.out.println("Salary: " + salary);

        // Close the scanner
        scanner.close();
    }

    // Method to clear the console
    public static void clearConsole() {
        try{
            // Create a new process to execute the "cls" command
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            
            // Redirect the output of the process to the current console
            pb.inheritIO().start().waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}