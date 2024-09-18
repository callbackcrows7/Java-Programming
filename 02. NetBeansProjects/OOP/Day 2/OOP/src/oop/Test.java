package oop;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        // Define and create a object call teacher1 from Teacher class.
        Teacher teacher1 = new Teacher();
        
        // Set content in teacher1 object
        teacher1.firstName = "MD. SHAHRIAR";
        teacher1.lastName = "Ahammad";
        teacher1.age = 23;
        teacher1.phone = 1581329149;
        
        // Display teacher1 information using displayItem() method
        teacher1.displayItem();
    }
}
