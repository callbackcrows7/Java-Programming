import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String input = scanner.nextLine();

        try {
            int age = Integer.parseInt(input);
            System.out.println("Your age is: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format for age.");
        }
    }
}