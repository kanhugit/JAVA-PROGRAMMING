public class HarshadNumber {
    public static void main(String[] args) {
        int number = 156; // You can change this number to test different values
        int sum = 0;
        int temp = number;

        // Calculate the sum of the digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}
