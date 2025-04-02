package arrayss;

public class MinPrimeOfArray {
	public static void main(String[] args) {
		int a[]= {1,4,7,6,11,9};
		
		int min_prime=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>1) {
				
				boolean isPrime=true;
				
				//check divisibilty by all numbers from 2 to a[i]/2
				
				for(int j=2;j<=a[i]/2;j++) {
					if(a[i]%j==0) {
						isPrime=false; // Not prime if divisible
						break;
					}
				}
                // If prime and smaller than the current min_prime, update min_prime

				if(isPrime && a[i]<min_prime) {
					min_prime=a[i];
				}
			}
		}
		
		//print the results
		if(min_prime==Integer.MAX_VALUE) {
			System.out.println("No prime number found in the Array");
		}else {
			System.out.println("Minum prime of given array :"+min_prime);
		}
	}
}
