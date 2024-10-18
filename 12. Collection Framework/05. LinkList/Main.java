import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // Add element
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Add element starting and ending position
        list.addFirst("Orange");
        list.addLast("Grape");

        System.out.println(list);

        // Remove element
        list.remove("Banana");
        System.out.println(list);
    }
}