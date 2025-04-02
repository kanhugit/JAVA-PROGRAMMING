package arrayss;

public class MaxEvenOfArray {
	public static void main(String[] args) {
		int a[]= {17,6,8,7,15,12};
		
		int max_even=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && a[i]>max_even) {
				max_even=a[i];
			}
		}
		//checking if any even number was found 
		
		if(max_even==Integer.MIN_VALUE) {
			System.out.println("No even number found in the Array:");
		}else {
			System.out.println("The maximum even number in the array is:"+max_even);
		}
	}
}
