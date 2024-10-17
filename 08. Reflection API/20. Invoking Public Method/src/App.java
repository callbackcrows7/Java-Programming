import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        try {
            Class<DisplayMessage> classObject = DisplayMessage.class;

            Method method = classObject.getMethod("sayHi", new Class[] {String.class});

            DisplayMessage displayMessageObject = classObject.newInstance();

            method.invoke(displayMessageObject, "John Doe");
        } catch (SecurityException | IllegalArgumentException |NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
