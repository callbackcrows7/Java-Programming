import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            MyClass obj = new MyClass();

            // Call showMessage using reflection
            Method method1 = MyClass.class.getMethod("showMessage");
            method1.invoke(obj);

            // Call causeException using reflection
            Method method2 = MyClass.class.getMethod("causeException");
            method2.invoke(obj);
        } catch(InvocationTargetException e) {
            System.out.println("InvocationTargetException: " + e.getCause());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
