package oop;

/**
 *
 * @author CBC7
 */
public class Teacher {
    String firstName;
    String lastName;
    int age;
    int phone;
    
    // Set teacher informatin using Teacher() constructor
    Teacher(String FirstName, String LastName, int Age, int Phone) {
        firstName = FirstName;
        lastName = LastName;
        age = Age;
        phone = Phone;
    }
    
    // Get/Display teacher information using getInfo() method.
    void getInfo() {
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
    }
}
