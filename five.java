import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        sc.close();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println(fact);
        }
        // System.out.println(fact);
    }
}
