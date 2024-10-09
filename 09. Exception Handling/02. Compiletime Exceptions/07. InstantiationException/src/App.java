public class App {
    public static void main(String[] args) throws Exception {
        try {
            Animal animal = Animal.class.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Does not make object from an abstract class");
        } catch (IllegalAccessException e) {
            System.out.println("Does not access class");
        }
    }
}
