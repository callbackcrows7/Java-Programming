
package encapsulation;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        Encapsulation person1 = new Encapsulation();
    
        person1.setName("MD. SHAHRIAR AHAMMAD");
        System.out.println("Name: "+person1.getName());
        
        person1.setAge(23);
        System.out.println("Age: "+person1.getAge());
        
        person1.setGender("MALE");
        System.out.println("Gender: "+person1.getGender());
    }
}
