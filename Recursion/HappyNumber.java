//A happy number is a number defined by the following process:

//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle that does not //include 1.
//Numbers for which this process ends in 1 are happy numbers, while those that do not are unhappy (or sad) numbers




public class HappyNumber {
    
    // Method to calculate the sum of squares of digits
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;  // Get the last digit
            sum += digit * digit; // Add the square of the digit to the sum
            n /= 10;              // Remove the last digit
        }
        return sum;
    }

    // Recursive method to check if a number is happy
    public static boolean isHappy(int n, int originalNum) {
        if (n == 1) {
            return true;  // Base case: found a happy number
        }
        if (n == 4) {
            return false; // Base case: found a cycle (not happy)
        }
        
        // Recursive call with the sum of squares of digits
        return isHappy(sumOfSquares(n), originalNum);
    }

    public static void checkHappyNumber() {
        int num = 19;  // Change this number to test other values
        if (isHappy(num, num)) {
            System.out.println(num + " is a happy number");
        } else {
            System.out.println(num + " is not a happy number");
        }
    }

    public static void main(String[] args) {
        checkHappyNumber();
    }
}
