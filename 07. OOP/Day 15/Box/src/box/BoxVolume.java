
package box;

/**
 *
 * @author CBC7
 */
public class BoxVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        box1.displayVol();
        
        Box box2 = new Box(20, 30, 10);
        box2.displayVol();
    }
    
}
