
public class fourtheen {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
            }
        });

        t.setDaemon(true); // Mark as daemon
        t.start();

        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
        // System.out.println("Main thread ends");
        // Once main thread (user thread) ends, daemon thread dies automatically
    }
}
