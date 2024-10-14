import java.lang.annotation.Annotation;

public class App {
    public static void main(String[] args) {
        Class<Display> displayClass = Display.class;

        Annotation[] annotationsArray = displayClass.getAnnotations();

        for (Annotation annotation : annotationsArray) {
            System.out.println(annotation);
        }
    }
}
