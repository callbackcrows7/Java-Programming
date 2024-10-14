import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InstantiatingObjects {
    public static void main(String[] args) {
        try {
            Class classObject = String.class;

            Constructor constructor = classObject.getConstructor(StringBuffer.class);
            StringBuffer buffer = new StringBuffer("John Doe");
            String str = (String) constructor.newInstance(buffer);
            System.out.println(str);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException | IllegalArgumentException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}