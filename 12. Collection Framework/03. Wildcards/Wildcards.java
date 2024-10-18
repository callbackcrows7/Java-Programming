import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World!");

        printList(list);
    }

    public static void printList(List<?>list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}