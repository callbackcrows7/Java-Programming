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
    
    // Parametrize constructor to set teacher info in teacher object.
    Teacher(String FirstName, String LastName, int Age, int Phone) {
        firstName = FirstName;
        lastName = LastName;
        age = Age;
        phone = Phone;
    }
    
    // Default constructor to print a message.
    Teacher() {
        System.out.println("No Parameter");
    }
    
    // Method to get/display teacher object information.
    void getInfo(){
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
    }
}
