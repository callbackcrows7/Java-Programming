import Department.Student;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Alice", 25);

        Class<? extends Student> classObject = student.getClass();
        System.out.println("Class Name: " + classObject.getName());
        System.out.println("Simple Name: " + classObject.getSimpleName());
    }
}
