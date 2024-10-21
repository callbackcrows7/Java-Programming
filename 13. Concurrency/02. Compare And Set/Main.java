import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        AtomicReference<String> str = new AtomicReference<>("SHAHRIAR");

        str.compareAndSet("SHAHRIAR", "CBC7");

        System.out.println(str);
    }
}