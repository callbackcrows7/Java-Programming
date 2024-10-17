import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) {
        try {
            Class<Student> classObject = Student.class;

            Field ageField = classObject.getField("age");
            System.out.println("Field Name: " + ageField.getName());
            System.out.println("Field Type: " + ageField.getType());

            Student student = classObject.newInstance();

            ageField.set(student, 25);
            Object ageValue = ageField.get(student);
            System.out.println("Age: " + ageValue);
        } catch (NoSuchFieldException | SecurityException | IllegalAccessException | IllegalArgumentException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
