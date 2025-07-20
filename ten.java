public class ten {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int n = arr.length;
        int countZero = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < countZero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for (int a : arr) {
            System.out.print(a);

        }

    }
}
