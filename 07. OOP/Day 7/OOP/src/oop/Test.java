package oop;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        // Define, Create and initilization student1 object from Student class
        Student student1 = new Student("MD. SHAHRIAR", "AHAMMAD", 258);
        student1.getInfo(); // Print/Display student information using getInfo method
        
        // Define, Create and initilization student2 object from Student class
        Student student2 = new Student("SHAWON", "SHAHRIAR", 852);
        student2.getInfo(); // Print/Display student information using getInfo method
        
        // Define, Create and initilization student3 object from Student class
        Student student3 = new Student("SANDHA RANI", "PAUL", 963);
        student3.getInfo(); // Print/Display student information using getInfo method
    }
}
