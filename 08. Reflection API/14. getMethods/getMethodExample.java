import java.lang.reflect.Method;
import java.util.ArrayList;

public class getMethodExample {
    public static void main(String[] args) {
        Class<ArrayList> classObject = ArrayList.class;

        Method[] methods = classObject.getMethods();

        System.out.println("Methods in ArrayList class:\n");
        for (Method method : methods) {
            System.out.println("- " + method);
        }
    }
}