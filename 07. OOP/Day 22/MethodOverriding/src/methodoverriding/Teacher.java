
package methodoverriding;

/**
 *
 * @author CBC7
 */
public class Teacher extends Person {
    private String qulafication;
    
    public void setQulafication(String qulafication) {
        this.qulafication = qulafication;
    }
    
    public String getQulafication() {
        return qulafication;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Teacher Name: "+getName());
        System.out.println("Teacher Age: "+getAge());
        System.out.println("Teacher Gender: "+getGender());
        System.out.println("Teacher Qulafication: "+getQulafication());
        System.out.println();// Create a new line
    }
}
