import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Class<Student> classObject = Student.class;

        Method[] methodArray = classObject.getMethods();
        for (Method method : methodArray) {
            if (isGetter(method))
                System.out.println("Getter: " + method);
            if (isSetter(method))
                System.out.println("Setter: " + method);
        }
    }

    // Getter Method name start with "get", take 0 parameters and return a value
    public static boolean isGetter(Method method) {
        if (!method.getName().startsWith("get")) {
            return false;
        }
        else if (method.getParameterTypes().length != 0) {
            return false;
        }
        else if (void.class.equals(method.getReturnType())) {
            return false;
        } else {
            return true;
        }
    }

    // Setter Method name start with "set", take 0 parameters and return a value
    public static boolean isSetter(Method method) {
        if (!method.getName().startsWith("set")) {
            return false;
        }
        else if (method.getParameterTypes().length != 1) {
            return false;
        } else {
            return true;
        }
    }
}
