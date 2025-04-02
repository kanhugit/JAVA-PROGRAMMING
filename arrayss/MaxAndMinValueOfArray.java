package arrayss;

public class MaxAndMinValueOfArray {
	public static void main(String[] args) {
			int a[]= {17,6,8,7,15,12};
			
			//max value of an array
			int max=a[0];
			for(int i=0;i<a.length;i++) {
				
				if(a[i]>max) {
					max=a[i];
				}
			}
			System.out.println("Max value of given array is :"+max);
			
			
			//minimum value of an array
			int min=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]<min) {
					min=a[i];
				}
			}
			System.out.println("Min value of given array is :"+min);
			
//			//max even of an array 
//			int max_even=a[0];
//			for(int i=0;i<a.length;i++) {
//				if(a[i]%2==0 &&a[i]>max_even) {
//					max_even=a[i];
//				}
//			}
//			System.out.println("Max even of given array :"+max_even);
//			
			//minimum even of an array
			int min_even=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]%2==0 && a[i]<min_even)
					min_even=a[i];
			}
			System.out.println("Minimum even of given array:"+min_even);
			
//					

	}
}
