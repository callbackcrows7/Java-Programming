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
    
    // Default constructor to print a message.
    Teacher () {
        System.out.println("No parameter");
        System.out.println();
    }
    
    // Parametrized constructor to set information in teacher object
    Teacher(String FirstName, String LastName) {
        firstName = FirstName;
        lastName = LastName;
    }
    
    // Parametrized constructor to set information in teacher object
    Teacher(String FirstName, String LastName, int Age, int Phone) {
        firstName = FirstName;
        lastName = LastName;
        age = Age;
        phone = Phone;
    }
    
    // Method to get/display teacher object information.
    void getInfo(){
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);  
        System.out.println(); // Create a new line.
    }
}
