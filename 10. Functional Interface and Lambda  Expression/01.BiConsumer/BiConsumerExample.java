import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + " is " + age + " years old!");
        biConsumer.accept("Alic", 23);
        biConsumer.accept("Bob", 23);
    }
}