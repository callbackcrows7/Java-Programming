import java.util.function.IntFunction;

public class IntFunctionExample {
    public static void main(String[] args) {
        IntFunction<Integer> sqrt = (int num) -> num * num;

        int result = sqrt.apply(16);

        System.out.println("Sqrt:" + result);
    }
}