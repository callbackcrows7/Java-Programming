import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.HashSet;

public class getConstructorParameter {
    public static void main(String[] args) {
        Class<HashSet> hashSetClass = HashSet.class;

        Constructor<?>[] constructorArray = hashSetClass.getConstructors();

        for (Constructor<?> constructor : constructorArray) {
            System.out.println("- Constructor " + constructor);
            System.out.println("- Parameter Count " + constructor.getParameterCount());

            Parameter[] parameter = constructor.getParameters();
            for (Parameter parameter1 : parameter) {
                System.out.println("  - Parameter Type: " + parameter1.getParameterizedType());
                System.out.println("  - Parameter Name: " + parameter1.getName());
            }
            System.out.println("---------------------------------------------");
        }
    }
}