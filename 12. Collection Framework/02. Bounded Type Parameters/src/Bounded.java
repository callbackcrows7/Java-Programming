public class Bounded {
    public static void main(String[] args) {
        print(10);
        print(15.5);
    }
    public static <T extends Number> void print(T number) {
        System.out.println(number);
    }
}
