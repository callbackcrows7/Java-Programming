import java.util.stream.Stream; 
public class StreamBuilderExample { 
    public static void main(String[] args) { 
        Stream.Builder<String> builder = Stream.builder(); 
        builder.add("Rahim").add("Karim").add("Salam"); 
        Stream<String> names = builder.build(); 
        names.forEach(System.out::println); // Rahim, Karim, Salam 
    } 
}