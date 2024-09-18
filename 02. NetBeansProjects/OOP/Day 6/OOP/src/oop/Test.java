package oop;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        // Define, create and initilization teacher1 object from Teacher class
        Teacher teacher1 = new Teacher();
        
        // Define, create and initilization teacher2 object from Teacher class
        Teacher teacher2 = new Teacher("MD. SHAHRIAR", "AHAMMAD");
        teacher2.getInfo(); // Display or get teacher2 information.
        
        // Define, create and initilization teacher2 object from Teacher class
        Teacher teacher3 = new Teacher("MD. SHAHRIAR", "AHAMMAD", 23, 1581329149);
        teacher3.getInfo(); // Display or get teacher3 information.
    }
}
