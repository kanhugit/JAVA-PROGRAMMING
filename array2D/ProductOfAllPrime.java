package array2D;

public class ProductOfAllPrime {

    public static void main(String[] args) {
        int N = 10; // You can change N to any number to find primes up to that number
        long product = 1;

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                product *= i;
            }
        }

        System.out.println("Product of all prime numbers up to " + N + ": " + product);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true; // Prime if no divisors were found
    }
}
