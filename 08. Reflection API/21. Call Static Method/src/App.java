import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        try {
            Class<DisplayMessage> classObject = DisplayMessage.class;

            Method method = classObject.getMethod("sayHi", new Class[] { String.class });

            method.invoke(null, "Hello, World!");
        } catch (SecurityException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
