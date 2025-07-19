import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        sc.close();
        // int sum = 1;
        // int diff = 2;

        // System.out.println("The AP series is ");
        // for (int i = 0; i < n; i++) {
        // System.out.println(sum);
        // sum += diff;

        // }

        // use this endterm = first_element + (n-1)*diff
        // for AP - 1,3,5,7,9 - 1+(n-1)*2 = 2n-1;
        // for AP - 4,7,10,13 - 4+(n-1)*3 = 3n-1
        // for (int i = 4; i <= 3 * n + 1; i = i + 3) {
        // System.out.println(i);
        // }

        // GP
        int sum1 = 1;
        int diff1 = 2;
        System.out.println("The GP series is ");
        for (int i = 0; i < n; i++) {
            System.out.println(sum1);
            sum1 *= diff1;

        }

    }
}
