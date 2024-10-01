
package superconstruction;

/**
 *
 * @author CBC7
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    
    Student (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    public void displayInfo() {
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Gender: "+getGender());
    }
}
