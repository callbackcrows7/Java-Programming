import Department.Student;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Alice", 25);

        /* 
         * Returns: The Class object that represents the runtime class of this object
         */
        Class<? extends Student> classObject = student.getClass();
        System.out.println("Class Name: " + classObject.getName());
        System.out.println("Simple Name: " + classObject.getSimpleName());
    }
}
