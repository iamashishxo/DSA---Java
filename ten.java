public class ten {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int n = arr.length;
        // int countZero = 0;

        // for (int i = 0; i < n; i++) {
        // if (arr[i] == 0) {
        // countZero++;
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // if (i < countZero) {
        // arr[i] = 0;
        // } else {
        // arr[i] = 1;
        // }
        // }

        // for (int a : arr) {
        // System.out.print(a);

        // }

        int left = 0;
        int right = n - 1;

        // two pointer approach
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }

        for (int a : arr) {
            System.out.print(a);

        }

    }
}
