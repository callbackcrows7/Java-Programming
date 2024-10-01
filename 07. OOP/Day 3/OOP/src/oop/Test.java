
package oop;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        // Define and create a teacher1 object from Teacher class.
        Teacher teacher1 = new Teacher();
        
        // Set information in teacher1 using setInfo() method.
        teacher1.setInfo("MD. Shahriar", "Ahammad", 23, 1581329149);
        
        // Get/Display teacher1 information using getInfo() method
        teacher1.getInfo();
    }
}
