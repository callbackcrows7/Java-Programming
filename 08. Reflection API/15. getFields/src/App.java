import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) {
        Class<Student> student = Student.class;

        Field[] fieldArray = student.getFields();

        for (Field field : fieldArray) {
            System.out.println(field);
            System.out.println("- Field Name: " + field.getName());
            System.out.println("- Field Type: " + field.getType().getName());
            System.out.println();
        }
    }
}
