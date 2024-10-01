
package methodoverloding;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        MethodOverloding sum = new MethodOverloding();
        
        int result_1 = sum.add(10, 20);
        System.out.println("Sum of a and b is: "+result_1);
        
        float result_2 = sum.add(50.10f, 60.70f);
        System.out.println("Sum of a and b is: "+result_2);
        
        double result_3 = sum.add(100.50000, 500.50000);
        System.out.println("Sum of a and b is: "+result_3);
    }
}
