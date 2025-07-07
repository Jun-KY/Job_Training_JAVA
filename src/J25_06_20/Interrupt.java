package J25_06_20;

public class Interrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Working");

                    Thread.sleep(500);

                }
            } catch (InterruptedException e) {
                System.out.println("Worker: Receive stop signal, shut down after cleaning up");
            }
        });

        worker.start();
        Thread.sleep(2000);
        System.out.println("Send interrupt signal from Main");
        worker.interrupt();
        worker.join();
        System.out.println("Worker: Task finished");
    }
}
