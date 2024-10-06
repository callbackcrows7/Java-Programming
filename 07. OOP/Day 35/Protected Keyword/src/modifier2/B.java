package modifier2;
import modifier1.A;

public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // Output: This is a protected method inside A class!
    }
}
