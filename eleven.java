public class eleven {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6,  8, 1, 62 };
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        // two pointer approach
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");

        }
    }
}
