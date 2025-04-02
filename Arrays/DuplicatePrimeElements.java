public class DuplicatePrimeElements {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {11, 13, 17, 11, 19, 23, 13, 29, 17, 13};

        System.out.println("Duplicate Prime Elements:");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) { // Check if the element is prime
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        break; 
                    }
                }
            }
        }
    }
}
