import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        sc.close();

        int rev = 0;

        while (n >= 0) {

            int ld = n % 10;
            rev *= 10;
            rev += ld;
            n /= 10;
        }
        System.out.println(rev);
    }

}
