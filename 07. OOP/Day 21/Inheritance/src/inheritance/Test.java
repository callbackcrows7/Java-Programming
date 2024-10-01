
package inheritance;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        
        // Set teacher1 information
        teacher1.setName("ANISUL ISLAM");
        teacher1.setAge(29);
        teacher1.setGender("MALE");
        teacher1.setQulafication("MSC in CSE");
        
        // Display teacher1 information
        teacher1.displayInfo();
        
    }
}
