
package supermethod;

/**
 *
 * @author CBC7
 */
public class Teacher extends Student{
    private String qulafication;
    
    public void setQulafication(String qulafication) {
        this.qulafication = qulafication;
    }
    
    public String getQulafication() {
        return qulafication;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Qulafication: "+getQulafication());
    }
}
