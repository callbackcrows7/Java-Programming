package oop;

/**
 *
 * @author CBC7
 */
public class InstantVariable {
    int count = 0;
    
    InstantVariable(){
        count ++;
    }
    
    void getTotalStudetn(){
        System.out.println("Total student in this program is: "+count);
    }
}
