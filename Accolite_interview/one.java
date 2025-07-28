import java.util.HashSet;

class one {
    public static void main(String args[]) {
        int[] arr = new int[] { 1, -1, -5, 2, 6, 9, 3 }; // {1,2,3,4}

        HashSet<Integer> positive = new HashSet<>();

        for (int i : arr) {
            if (i > 0) {
                positive.add(i);
            }
        }

        int i = 1;
        while (true) {
            if (!positive.contains(i)) {
                System.out.println(i);
                break;
            }
            i++;
        }

    }
}