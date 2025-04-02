public class MinElementArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 2, 17};

        int min = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element in the array: " + min);
    }
}
