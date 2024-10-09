public class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread will sleeping");
            Thread.sleep(5000);
            System.out.println("Thread sleeping end.");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}
