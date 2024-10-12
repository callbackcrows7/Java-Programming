import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Book এর তালিকা তৈরি
        List<Book> books = Arrays.asList(
                new Book("Java Programming", "John Doe"),
                new Book("Effective Java", "Joshua Bloch"),
                new Book("Clean Code", "Robert C. Martin")
        );

        // Stream থেকে প্রথম বইটি খোঁজা
        Optional<Book> book = books.stream().findFirst();

        // যদি বই পাওয়া যায়, তার title print করা হবে
        book.ifPresent(b -> System.out.println("Book Title: " + b.getTitle()));
    }
}

