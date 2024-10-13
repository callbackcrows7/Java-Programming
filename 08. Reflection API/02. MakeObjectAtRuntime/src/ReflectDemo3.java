import Department.Student;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        /* 
         * If a type is available but there is no instance then it is possible to
         * obtain a Class by appending ".class" to the name of the type.
         * It can be used for primitive data types also.
         */

        Class<Student> studentClassObject = Student.class;
        System.out.println("Class Name: " + studentClassObject.getName());

        Class<Integer> intClassObject = int.class;
        System.out.println("Class Name: " + intClassObject.getName());
    }
}
