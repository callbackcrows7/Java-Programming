package oop;

/**
 *
 * @author CBC7
 */
public class Student {
    String firstName;
    String lastName;
    int id;
    static String collageName = "Khulna Polytechnic Institute";
    
    // Parametrized constructor to set information in teacher object
    Student(String FirstName, String LastName, int Id) {
        firstName = FirstName;
        lastName = LastName;
        id = Id;
    }
    
    // Method to get/display teacher object information
    void getInfo() {
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Id: "+id);
        System.out.println("Collage Name: "+collageName);
        System.out.println(); // Create a new line
    }
}
