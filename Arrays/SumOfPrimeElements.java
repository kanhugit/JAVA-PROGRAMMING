public class SumOfPrimeElements {
    public static void main(String[] args) {
        int[] arr = {4, 3, 8, 2, 7, 5, 2};

        int sumOfPrimes = 0;

        for (int num : arr) {
            if (isPrime(num)) {
                sumOfPrimes += num;
            }
        }

        System.out.println("Sum of prime elements in the array: " + sumOfPrimes);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
 class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {34, 15, 88, 2, 17};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element in the array: " + max);
    }
}
