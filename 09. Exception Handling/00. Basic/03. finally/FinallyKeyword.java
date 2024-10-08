import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyKeyword {
    public static void main(String[] args) {
        readFile();    
    }

    public static void readFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file!" + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file!" + e.getMessage());
            }
        }
    }
}