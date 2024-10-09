public class App {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.start();

        try {
            Thread.sleep(2000);
            t.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
