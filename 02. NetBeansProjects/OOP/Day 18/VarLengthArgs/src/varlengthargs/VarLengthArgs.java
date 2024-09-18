
package varlengthargs;

/**
 *
 * @author CBC7
 */
public class VarLengthArgs {
    void add (int ... number) {
        int sum = 0;
        
        for (int x : number) {
            sum += x;
        }
        System.out.println("Sum of numbers is: "+sum);
    }
}
