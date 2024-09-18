
package callbyref;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        CallByRef swap = new CallByRef();
        
        swap.x =20;
        
        // Before calling change method value of a 
        System.out.println("Before Value: "+swap.x);
        
        // Call change method
        swap.change(swap);
        
        // After Calling method value of a.
        System.out.println("After value: "+swap.x);
    }
}
