import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
       Class<DisplayMessage> messageClass = DisplayMessage.class;

       Method[] methodArray = messageClass.getMethods();

       for (Method method : methodArray) {
            System.out.println(method);
            System.out.println("- Parameter: " + method.getParameterCount());
            System.out.println();
       }
    }
}
