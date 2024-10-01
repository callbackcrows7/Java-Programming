
package superconstruction;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        // Create and initialized a student object from Student class
        Student student1 = new Student("MD. SHAHRIAR AHAMMAD", 23, "MALE");
        
        // Display student1 information
        student1.displayInfo();
        System.out.println();  // Create a new line.
        
        // Create and initialized a teacher object from teacher class
        Teacher teacher1 = new Teacher("ANISUL ISLAM", 29, "MALE", "MSC in CSE");
        
        // Display teacher1 information
        teacher1.displayInfo();
    }
}
