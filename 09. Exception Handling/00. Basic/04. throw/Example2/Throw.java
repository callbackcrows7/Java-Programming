public class Throw{
    public static void main(String[] args) {
        String str = null;

        if (str == null) {
            throw new NullPointerException("Input string is null.");
        } else {
            System.out.println(str.length());
        }
    }
}