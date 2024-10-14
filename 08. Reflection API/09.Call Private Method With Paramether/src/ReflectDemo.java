import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        try {
            Class<?> classObject = Class.forName("Student");

            Student studentObject = (Student) classObject.newInstance();
            
            Method method = classObject.getDeclaredMethod("displayFullName", String.class, String.class);
            method.setAccessible(true);

            method.invoke(studentObject, "John", "Doe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
