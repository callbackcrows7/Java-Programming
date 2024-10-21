public class Main {
    public static void main(String[] args) {
        // Create Runnable tasks
        Runnable task1 = new TaskRunnable();
        Runnable task2 = new TaskRunnable();

        // Create and start threads
        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        thread1.start();
        thread2.start();

        // Ensure the main thread waits for the other threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
