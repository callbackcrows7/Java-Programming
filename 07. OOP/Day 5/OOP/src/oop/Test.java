package oop;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        // Define and Create a teacher1 object from teacher class
        Teacher teacher1 = new Teacher();
        
        // Display/get teacher2 information using getInfo() method from Teacher class
        teacher1.getInfo();
        
        
        System.out.println();// Create a new line.
        
        
        // Define, Create and initilization a teacher2 object from teacher class
        Teacher teacher2 = new Teacher("MD. SHAHRIAR", "AHAMMAD", 23, 1581329149);
        
        // Display/get teacher2 information using getInfo() method from Teacher class
        teacher2.getInfo();
    }
}
