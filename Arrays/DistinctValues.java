
import java.util.Arrays;

public class DistinctValues {
    public static void main(String[] args) {

        int[] inputArray = {4, 2, 2, 8, 4, 6, 8, 10, 6};
        
        int[] tempArray = new int[inputArray.length];
        int distinctCount = 0;


        for (int i = 0; i < inputArray.length; i++) {
            boolean isDistinct = true;

            for (int j = 0; j < distinctCount; j++) {
                if (inputArray[i] == tempArray[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                tempArray[distinctCount] = inputArray[i];
                distinctCount++;
            }
        }


        int[] distinctArray = Arrays.copyOf(tempArray, distinctCount);

        System.out.println("Distinct values: " + Arrays.toString(distinctArray));
    }
}
