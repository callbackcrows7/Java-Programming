import java.util.Arrays; 
import java.util.List; 

public class ParallelStreamBookExample { 
    public static void main(String[] args) { 
        List<Book> books = Arrays.asList( 
            new Book("Java Programming", 29.99), 
            new Book("Python Basics", 19.99), 
            new Book("C++ Fundamentals", 24.99), 
            new Book("Data Structures", 35.50), 
            new Book("Algorithms", 45.00), 
            new Book("Operating Systems", 30.75) 
        ); 
  
        books.parallelStream() 
             .forEach(book -> { 
                 book.setPrice(book.getPrice() + 10); 
                 System.out.println(book.getTitle() + ": " + book.getPrice()); 
             }); 
  
    } 
} 
