import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.TreeMap;

public class GroupByAuthorExample {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Author1", "Title1", 29.99),
            new Book("Author2", "Title2", 39.99),
            new Book("Author1", "Title3", 19.99)
        );

        // Group books by author and use TreeMap to sort by author name
        Map<String, List<Book>> groupedByAuthor = books.stream()
            .collect(Collectors.groupingBy(
                Book::getAuthor, TreeMap::new, Collectors.toList()
            ));

        // Print the result
        groupedByAuthor.forEach((author, bookList) -> {
            System.out.println("Author: " + author);
            bookList.forEach(book -> System.out.println("  " + book));
        });
    }
}
