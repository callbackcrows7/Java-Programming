public class App {
    public static void main(String[] args) throws Exception {
        // Creating an anonymous class for override a method at runtime.
        Person person = new Person() {
            @Override
            public void sayHello() {
                System.out.println("Hello, Anonymous class!");
            }
        };
        person.sayHello();
    }
}
