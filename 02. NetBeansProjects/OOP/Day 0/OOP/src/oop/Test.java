package oop;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        // Define a object call teacherOne from Teacher class.
        Teacher teacherOne;

        // Create a object call teacherOne from Teacher class.
        teacherOne = new Teacher();
        
        // Set teacherOne information
        teacherOne.firstName = "MD. SHAHRIAR";
        teacherOne.lastName = "Ahammad";
        teacherOne.age = 23;
        teacherOne.gender = "Male";
        teacherOne.department = "CSE";
        teacherOne.phone = 1581329149;
        
        // Display teacherOne information
        System.out.println("First Name: "+teacherOne.firstName);
        System.out.println("Last Name: "+teacherOne.lastName);
        System.out.println("Age: "+teacherOne.age);
        System.out.println("Gender: "+teacherOne.gender);
        System.out.println("Department: "+teacherOne.department);
        System.out.println("Phone: "+teacherOne.phone);
       
    }
}
