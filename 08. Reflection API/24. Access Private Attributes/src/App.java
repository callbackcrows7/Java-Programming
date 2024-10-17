import java.lang.reflect.Field;
import java.lang.Class;

public class App {
    public static void main(String[] args) throws NoSuchFieldException {
        try {
            Class classObject = Student.class;

            Field privateFieldObject = classObject.getDeclaredField("name");
            
            privateFieldObject.setAccessible(true);
            Student student = new Student("John Doe");
            String fieldValue = (String) privateFieldObject.get(student);
            System.out.println("PrivateNameField value: " + fieldValue);
        } catch (SecurityException | IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
