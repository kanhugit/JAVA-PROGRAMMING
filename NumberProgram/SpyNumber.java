public class SpyNumber {
    public static void main(String[] args) {
          // Calculate the sum and product of the digits
          int number=123; 
          int sum = 0;
          int product = 1;
          int temp = number;
  
          while (temp > 0) {
              int digit = temp % 10;
              sum += digit;
              product *= digit;
              temp /= 10;
          }
  
          // Check if the number is a spy number
          if (sum == product) {
              System.out.println(number + " is a Spy Number.");
          } else {
              System.out.println(number + " is not a Spy Number.");
          }
  
    }
}
