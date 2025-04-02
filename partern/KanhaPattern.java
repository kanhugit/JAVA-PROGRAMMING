public class KanhaPattern {
    public static void main(String[] args) {
        // Define the size of the pattern grid (height and width)
        int height = 7; // Number of rows (height of each character)
        int width = 5;  // Number of columns per character
        
        // Loop over the rows
        for (int i = 0; i < height; i++) {
            // Loop for 'K'
            for (int j = 0; j < width; j++) {
                if (j == 0 || (i == j && j > 0) || (i + j == width - 1 && j > 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // Space between letters

            // Loop for 'A'
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || (i == 0 && j > 0 && j < width - 1) || i == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // Space between letters

            // Loop for 'N'
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // Space between letters

            // Loop for 'H'
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || i == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // Space between letters

            // Loop for 'A' again
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || (i == 0 && j > 0 && j < width - 1) || i == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after printing one row of all characters
            System.out.println();
        }
    }
}
