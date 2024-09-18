
package methodoverriding;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        // Create a person object from Person class
        Person person1 = new Person();
        
        // Set person1 name, age and gender
        person1.setName("MD. SHAHRIAR");
        person1.setAge(23);
        person1.setGender("MALE");
        
        // Display person1 information
        person1.displayInfo();
        
        
        // Create a teacher object from Teacher class
        Teacher teacher1 = new Teacher();
        
        // Set teacher1 name, age, gender and qulafication
        teacher1.setName("ANISUL ISLAM");
        teacher1.setAge(29);
        teacher1.setGender("MALE");
        teacher1.setQulafication("MSC in CSE");
        
        // Display teacher1 information
        teacher1.displayInfo();
    }
}
