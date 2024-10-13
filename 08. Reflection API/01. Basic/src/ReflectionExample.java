import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Student student = new Student("John", 30);
        

        // Returns: The class object that represents the runtime class of this object.
        Class<? extends Student> studentClass = student.getClass();


        // Returns: The array of method objects representing the public methods of this class.
        Method[] methodArray = studentClass.getMethods();

        for (Method method : methodArray) {
            System.out.println("Method Name: " + method.getName());
        }

        System.out.println("----------------------------------------------------------------");

        // Returns: The array of field objects representing all the declared fields of this class.
        Field[] fieldArray = studentClass.getDeclaredFields();
        
        for (Field field : fieldArray) {
            System.out.println("Field Name: " + field.getName());
        }
    }
}
