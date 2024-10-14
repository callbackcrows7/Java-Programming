import java.util.ArrayList;

public class GetSuperClassInfo {
    public static void main(String[] args) {
        Class<ArrayList> classObject = ArrayList.class;

        Class<? super ArrayList> superClass = classObject.getSuperclass();

        System.out.println(superClass);
        System.out.println("Name: " + superClass.getName());
        System.out.println("Simple Name: " + superClass.getSimpleName());
    }
}