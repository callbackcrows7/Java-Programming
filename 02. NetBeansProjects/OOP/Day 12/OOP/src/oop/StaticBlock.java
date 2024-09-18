package oop;

/**
 *
 * @author CBC7
 */
public class StaticBlock {
    private static String name;
    private static int age;
    
    static {
        name = "MD. SHAHRIAR";
        age = 23;
    }
    
    static void getItem() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
