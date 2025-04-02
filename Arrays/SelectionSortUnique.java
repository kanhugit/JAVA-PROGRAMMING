public class SelectionSortUnique {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 6, 8, 7, 2, 3, 2, 5, 7};
        
        // Step 1: Perform selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        // Step 2: Print unique elements
        for (int i = 0; i < arr.length; i++) {
            // Check if current element is not equal to the previous one
           // if (i == 0 || arr[i] != arr[i - 1]) {
           //     System.out.print(arr[i]);
           //     if (i < arr.length - 1) System.out.print(", ");
           // }

		if (arr[i] == 2 || arr[i] == 5 || arr[i] == 7) {
    			System.out.print(arr[i]);
   	 	if (i < arr.length - 1)
			 System.out.print(", ");
		}

        }
    }
}


//if (arr[i] == 2 || arr[i] == 5 || arr[i] == 7) {
//   System.out.print(arr[i]);
//    if (i < arr.length - 1) System.out.print(", ");
//}

