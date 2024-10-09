import java.lang.reflect.Method;

public class NoSuchMethodExceptionExample {
    public static void main(String[] args) {
        try {
            Method method = String.class.getMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("Error: No such method found! " + e.getMessage());
        }
    }
}