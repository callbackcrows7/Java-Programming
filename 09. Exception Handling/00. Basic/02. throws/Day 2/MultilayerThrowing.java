import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultilayerThrowing {
    public static void main(String[] args) {
        // Calling process file
        try {
            processFile();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
    }

    public static void processFile() throws IOException{
        readFile("example.txt");
    }

    public static void readFile(String path) throws IOException {
        FileReader reader = new FileReader(path);
    
        BufferedReader fileInput = new BufferedReader(reader);
        System.out.println(fileInput.readLine());
        fileInput.close();
        
    } 
}
