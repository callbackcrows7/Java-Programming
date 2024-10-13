import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class displayMetaData {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please enter a class name: ");
            String className= reader.readLine();
            reader.close();

            // Display meta data of a class object.
            // Get class object name
            Class<?> classObject = Class.forName(className);
            System.out.println("\nClass Name:\n" + classObject.getName());
            System.out.println("-----------------------------------------------");

            // get class object fields
            System.out.println("\nFields: ");
            Field[] fieldArray = classObject.getDeclaredFields();

            for (Field field : fieldArray) {
                System.out.println(field);
            }
            System.out.println("-----------------------------------------------");

            // get class object constructors
            System.out.println("\nConstructors: ");
            Constructor<?>[] constructorArray = classObject.getDeclaredConstructors();

            for (Constructor<?> constructor : constructorArray) {
                System.out.println(constructor);
            }
            System.out.println("-----------------------------------------------");

            // get class object methods
            System.out.println("\nMethods: ");
            Method[] methodArray = classObject.getDeclaredMethods();

            for (Method method : methodArray) {
                System.out.println(method);
            }
            System.out.println("-----------------------------------------------");

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}