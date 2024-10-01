
package methodoverriding;

/**
 *
 * @author CBC7
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void displayInfo() {
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Gender: "+getGender());
        System.out.println();// Create a new line
    }
}
