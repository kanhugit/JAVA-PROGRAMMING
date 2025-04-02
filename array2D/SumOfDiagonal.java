package array2D;

public class SumOfDiagonal {

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = a.length; // Get the number of rows/columns (assuming square matrix)

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += a[i][i]; // Summing up the primary diagonal
            secondaryDiagonalSum += a[i][n - i - 1]; // Summing up the secondary diagonal
        }

        System.out.println("Sum of Primary Diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);
    }
}
