
package recursion;

/**
 *
 * @author CBC7
 */
public class Recursion {
    
    int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
           return n * fact(n - 1);
        }
    }
    
}