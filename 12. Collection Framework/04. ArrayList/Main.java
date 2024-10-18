import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Access element
        System.out.println(list.get(1));

        // Remove element
        list.remove(2);
        System.out.println(list);

        // Check element
        System.out.println(list.contains("Cherry"));

        // Sizes of list
        System.out.println(list.size());
    }
}