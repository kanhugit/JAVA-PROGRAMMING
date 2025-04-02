public class DistinctEvenElements {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 2, 4, 10, 12, 8}; 


        int[] distinctEvens = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // Check if the number is even
                boolean isDistinct = true;

                for (int j = 0; j < count; j++) {
                    if (array[i] == distinctEvens[j]) {
                        isDistinct = false;
                        break;
                    }
                }
                

                if (isDistinct) {
                    distinctEvens[count++] = array[i];
                }
            }
        }

        System.out.print("Distinct even elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctEvens[i] + " ");
        }
    }
}
