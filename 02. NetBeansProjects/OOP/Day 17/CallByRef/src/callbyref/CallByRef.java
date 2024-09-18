
package callbyref;

/**
 *
 * @author CBC7
 */
public class CallByRef {
    int x;
    
    void change (CallByRef number) {
       number.x = 10;
    }
}
