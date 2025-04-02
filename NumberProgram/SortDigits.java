//WAP TO FIND  THE SUM OF EVEN POSITION DIGITS FROM GIVEN NUMBER?

class SortDigits {
    public static void main(String[] args) {
        int n = 14250378;
        int res = 0;

        // Iterate over digits from 0 to 9
        for (int i = 0; i <= 9; i++) {
            int temp = n; // Reset temp to n for each digit check

            // Check each digit in the number
            while (temp != 0) {
                int r = temp % 10; // Extract the last digit
                if (r == i) { // If digit matches current i
                    res = res * 10 + r; // Append digit to result
                }
                temp /= 10; // Remove the last digit
            }
        }

        System.out.print(res); // Output the sorted digits
    }
}
