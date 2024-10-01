package oop;

/**
 *
 * @author CBC7
 */
public class StaticVariable {
    static int count = 0;
    
    StaticVariable(){
        count++;
    }
    
    void getTotalStucdet() {
        System.out.println("Total student in this program is: "+count);
    }
}
