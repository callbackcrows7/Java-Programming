public class App {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello World");
        System.out.println(stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.setItem(100);
        System.out.println(intBox.getItem());
    }
}
