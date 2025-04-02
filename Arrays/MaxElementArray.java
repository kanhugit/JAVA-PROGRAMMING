public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {34, 15, 88, 2, 17};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element in the array: " + max);
    }
}
