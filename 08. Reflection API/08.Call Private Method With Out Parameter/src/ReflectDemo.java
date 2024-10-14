import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        try {
            Class<?> classObject = Class.forName("Student");

            Student studentObject = (Student) classObject.newInstance();
            
            Method method = classObject.getDeclaredMethod("displayFullName");
            method.setAccessible(true);

            method.invoke(studentObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
