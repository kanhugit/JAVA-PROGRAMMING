//WAP TO FORM A NUMBER USING ODD DIGIT OF GIVEN THE NUMBER.
class FormOddDigits {
    public static void main(String[] args) {
        int n = 538672;
        int res = 0, p = 1;

        while (n != 0) {
            int r = n % 10; // Extracting the last digit

            if (r % 2 == 1) { // Check if the digit is odd
                res = r * p + res;
                p = p * 10;
            }
            
            n /= 10; // Update n in every iteration to remove the last digit
        }

        System.out.print(res);//537
    }
}
