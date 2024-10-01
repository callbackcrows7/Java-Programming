import java.io.IOException;
import java.util.Scanner;

public class Counter{
    public static void main(String[] args) throws InterruptedException{
        int limit;
        Scanner scanner = new Scanner(System.in);
        Thread thread = new Thread();
        
        System.out.print("Enter the amount of seconds: ");
        limit = scanner.nextInt();

        for(int i = limit; i >= 0; i--) {
            clearConsole();
            System.out.println("Time left: " + i);
            thread.sleep(1000);
        }
        System.out.println("Count Down Complete");
    }
    
    // Method to clear the current console
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
}