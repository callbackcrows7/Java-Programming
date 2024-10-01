
package recursion;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        Recursion factorial = new Recursion();
        
        int num = 5;
        
        int result = factorial.fact(num);
        
        System.out.println("Fact of "+ num +"! is: "+result);
    }
}
