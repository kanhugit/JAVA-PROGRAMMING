public class UniqueSelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 6, 8, 7, 2, 3, 2, 5, 7};
        
        // Step 1: Sort the array using selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // Step 2: Filter and print only {2, 5, 7}
        System.out.print("{");
        boolean isFirst = true;
        for (int i = 0; i < arr.length; i++) {
            // Include only 2, 5, and 7
            if (arr[i] == 2 || arr[i] == 5 || arr[i] == 7) {
                // Avoid duplicates by checking the previous value
                if (i == 0 || arr[i] != arr[i - 1]) {
                    if (!isFirst) {
                        System.out.print(", ");
                    }
                    System.out.print(arr[i]);
                    isFirst = false;
                }
            }
        }
        System.out.println("}");
    }
}
