public class twelve {
    private String msg = "Hello from Outer class";

    class Inner {
        void display() {
            System.out.println(msg); // Accessing private field of outer class
        }
    }

    public static void main(String[] args) {
        twelve outer = new twelve();
        twelve.Inner inner = outer.new Inner();
        inner.display();
    }
}
