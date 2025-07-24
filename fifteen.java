// using Thread class extends

// class MyThread extends Thread {
// public void run() {
// System.out.println("Thread is running...");
// }
// }

// public class fifteen {
// public static void main(String[] args) {
// MyThread t1 = new MyThread();
// t1.start();

// }
// }

// using Runnable
// class Innerfifteen implements Runnable {

// @Override
// public void run() {
// System.out.println("Thread is running...");

// }

// }

// public class fifteen {
// public static void main(String[] args) {
// Thread t1 = new Thread(new Innerfifteen());
// t1.start();

// }
// }

// using anonymanss inner class

// public class fifteen {
// public static void main(String[] args) {
// Thread t1 = new Thread(new Runnable() {
// public void run() {
// System.out.println("Thread is running...");
// }
// });
// t1.start();
// }
// }

// using Lambda

public class fifteen {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

            System.out.println("Thread is running...");
        });
        t1.setDaemon(true);
        t1.start();

        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

    }
}