package arrayss;

public class MinEvenOfArray {
	public static void main(String[] args) {
		int a[]= {17,6,8,7,15,12};
		
		int min_even=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && a[i]<min_even)
				min_even=a[i];
		}
		if(min_even==Integer.MAX_VALUE) {
			System.out.println("Minimum even is not found ");
		}else {
			System.out.println("Minum even is found :"+min_even);
		}
	}
}
