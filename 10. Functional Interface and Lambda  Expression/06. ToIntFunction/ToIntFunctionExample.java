import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args) {
        ToIntFunction<String>lengthOfString = (String str) -> str.length();
        int length = lengthOfString.applyAsInt("Hello, World!");

        System.out.println("Length: " + length);
    }    
}
