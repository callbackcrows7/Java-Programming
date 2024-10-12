import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample { 
    public static void main(String[] args) { 
        List<Book> books = Arrays.asList( 
            new Book("Book1", 20.0), 
            new Book("Book2", 30.0), 
            new Book("Book3", 40.0) 
        ); 
  
        List<Book> increasedPrices = books.stream() 
                                          .peek(book -> book.setPrice(book.getPrice() + 10)) 
                                          .collect(Collectors.toList()); 
  
        increasedPrices.forEach(book -> System.out.println(book.getTitle() + ": " + book.getPrice())); 
        // Output: 
        // Book1: 30.0 
        // Book2: 40.0 
        // Book3: 50.0 
    } 
} 
 
