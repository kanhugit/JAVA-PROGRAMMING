public class Np11{
    public static void main(String[] args) {
        int rows = 4;  // Number of rows
        
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for centering the pyramid
            for (int s = i; s < rows; s++) {
                System.out.print("   ");
            }
            
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + "  ");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
