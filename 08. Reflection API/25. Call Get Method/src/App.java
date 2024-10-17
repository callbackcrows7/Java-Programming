import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        try {
            Class classObject = Student.class;
            Method privateGetNameMethod = classObject.getDeclaredMethod("getName");

            privateGetNameMethod.setAccessible(true);
            Student student = new Student("Jone Doe");
            String returnValue = (String) privateGetNameMethod.invoke(student);
            System.out.println("Name: " + returnValue);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
