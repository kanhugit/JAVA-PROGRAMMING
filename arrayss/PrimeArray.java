package arrayss;

public class PrimeArray {
	public static void main(String[] args) {
		int a[]= {5,3,32,7,8,2,8,20,45};
		
		System.out.println("Prime number in the array");
		
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				
				System.out.print(a[i]+" ");	
			}
		}
		
	}
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false; //num<=1 are not prime
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false; //not prime if divisible
			}
		}
		
		return true; //if all case are false then prime
	}
}
