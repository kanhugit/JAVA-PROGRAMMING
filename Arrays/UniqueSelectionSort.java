public class UniqueSelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 6, 8, 7, 2, 3, 2, 5, 7};
        
        // Step 1: Sort the array using selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        // Step 2: Print {2, 5, 7}
        System.out.print("{");
        boolean first = true;
        for (int i = 0; i < arr.length; i++) {
            // Include only 2, 5, or 7 and avoid duplicates
            if ((arr[i] == 2 || arr[i] == 5 || arr[i] == 7) && (i == 0 || arr[i] != arr[i - 1])) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
                first = false;
            }
        }
        System.out.println("}");
    }
}
