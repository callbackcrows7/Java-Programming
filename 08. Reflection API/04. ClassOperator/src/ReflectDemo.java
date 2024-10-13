import Department.Student;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        
        Class<Student> studentClassObject = Student.class;
        System.out.println("Class Name: " + studentClassObject.getName());

        Class<Integer> intClassObject = int.class;
        System.out.println("Class Name: " + intClassObject.getName());
    }
}
