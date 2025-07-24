// abstract class Animal {
//     abstract void sound();
// }

// public class thirtheen {

//     public static void main(String[] args) {
//         Animal a = new Animal() {
//             @Override
//             void sound() {
//                 System.out.println("Animal makes sound"); // anonymous inner class
//             }
//         };
//         a.sound();
//     }
// }

public class thirtheen {
    public static void main(String[] args) {
        // Creating an anonymous inner class that implements Runnable
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in anonymous inner class");
            }
        };
        r.run();
    }
}
