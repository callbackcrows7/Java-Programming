
package supermethod;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        // Create a student object from Student class
        Student student1 = new Student();
        
        // Set name, age, and gender in student object.
        student1.setName("MD. SHAHRIAR");
        student1.setAge(23);
        student1.setGender("MALE");
        
        // Display student information
        student1.displayInfo();
        System.out.println(); // Create a new line.
        
        
        // Create a teacher object from Teacher class
        Teacher teacher1 = new Teacher();
        
        // Set name, age, gender and qulafication in teacher object.
        teacher1.setName("ANISUL ISLAM");
        teacher1.setAge(29);
        teacher1.setGender("MALE");
        teacher1.setQulafication("MSC in CSE");
        
        // Display Teacher information
        teacher1.displayInfo();
    }
}
