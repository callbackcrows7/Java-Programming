package oop;

/**
 *
 * @author CBC7
 */
public class Test {
    public static void main(String[] args) {
        StaticMethod information = new StaticMethod();
        information.getInfo1(); // Print info 1
        
        StaticMethod.getInfo2(); // Print info 2
    }
}
