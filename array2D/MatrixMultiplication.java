package array2D;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 6 }, { 4, 5, 3 } };
        int b[][] = { { 3, 5 }, { 4, 1 }, { 2, 4 } };

        // Check if multiplication is possible
        if (a[0].length == b.length) {
            int res[][] = new int[a.length][b[0].length];

            // Matrix multiplication logic
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        res[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            // Printing the result
            System.out.println("Resultant Matrix:");
            for (int i[] : res) {
                for (int j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible");
        }
    }
}
