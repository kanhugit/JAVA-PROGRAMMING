package arrayss;

public class SumOfPrime {
	public static void main(String[] args) {
		int a[] = { 1, 4, 7, 6, 11, 9 };

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 1) {
				boolean isPrime = true;

				for (int j = 2; j <= a[i] / 2; j++) {
					if (a[i] % j == 0) {
						isPrime = false; // Not Prime if divisible
						break;
					}
				}
				// If num is prime add it to sum

				if (isPrime) {
					sum = sum + a[i];
				}
			}
		}
		System.out.println("Sum of prime in the array :" + sum);
	}
}
