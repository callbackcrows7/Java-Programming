
package instantvariablehiding;

/**
 *
 * @author CBC7
 */
public class InstantVariableHiding {

    String name;
    int age;
    int phone;
    
    InstantVariableHiding (String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    void getInfo() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
    }
    
}
