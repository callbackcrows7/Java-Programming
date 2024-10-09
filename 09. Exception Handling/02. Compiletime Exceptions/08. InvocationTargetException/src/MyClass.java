import java.lang.reflect.Method;


public class MyClass {
    public void showMessage() {
        System.out.println("Hello from MyClass!");
    }

    public void causeException() {
        throw new RuntimeException("An exception occurred!");
    }
}
