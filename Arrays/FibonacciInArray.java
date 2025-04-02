public class FibonacciInArray {

    static boolean isFibonacci(int n) {
        if (n < 0) {
            return false; 
        }
        int a = 0, b = 1;
        if (n == a || n == b) {
            return true;         }
        int c;
        while (true) {
            c = a + b;
            if (c == n) {
                return true; 
            }
            if (c > n) {
                return false; 
            }
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 5, 8, 10, 13, 21}; // Example array
        System.out.println("Fibonacci elements in the array:");
        
        
        for (int num : array) {
            if (isFibonacci(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
