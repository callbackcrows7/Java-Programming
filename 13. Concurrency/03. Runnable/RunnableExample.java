public class RunnableExample {
    public static void main(String[] args) {
        // Using Lambda Expression
        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Executing: " + name);
        };

        // Creating and starting threads using the anonymous inner class task
        Thread thread1 = new Thread(task, "Thread-1");
        thread1.start();

        // Creating and starting threads using the lambda expression task
        Thread thread2 = new Thread(task, "Thread-2");
        thread2.start();
    }
}
