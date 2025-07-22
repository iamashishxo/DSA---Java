public class eight {
    public static void main(String[] args) {

        int arr[] = { 2, 5, 7, 89, 43, 56, 78, 320, 500 };
        int arr1[] = new int[5];
        arr1[4] = 10;
        System.out.println(arr1[3]);

        // // find largest number
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("largest is " + max);

        // int secondMax = Integer.MIN_VALUE;
        // // second max
        // for (int i = 0; i < arr.length; i++) {
        // if (secondMax < arr[i] && arr[i] != max) {
        // secondMax = arr[i];
        // }
        // }
        // System.out.println("Second largest is " + secondMax);

        // int thirdMax = Integer.MIN_VALUE;
        // // second max
        // for (int i = 0; i < arr.length; i++) {
        // if (thirdMax < arr[i] && arr[i] != max && arr[i] != secondMax) {
        // thirdMax = arr[i];
        // }
        // }
        // System.out.println("Third largest is " + thirdMax);

        // int max = Integer.MIN_VALUE;
        // int secondMax = Integer.MIN_VALUE;
        // int thirdMax = Integer.MIN_VALUE;
        // for (int num : arr) {
        // if (num > max) {
        // thirdMax = secondMax;
        // secondMax = max;
        // max = num;
        // } else if (num > secondMax && num != max) {
        // thirdMax = secondMax;
        // secondMax = num;
        // } else if (num > thirdMax && num != max && num != secondMax) {
        // thirdMax = num;
        // }
        // }
        // System.out.println("largest is " + max);
        // System.out.println("Second largest is " + secondMax);
        // System.out.println("Third largest is " + thirdMax);
    }
}
