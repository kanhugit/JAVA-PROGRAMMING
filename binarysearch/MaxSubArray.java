//
package binarysearch;
//import java.util.Arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		int a[]= {5,-7,8,3,4,-6,7,-9,4};
		int max=0;
		int f=0;
		int l=0;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i+1;j<a.length;j++) {
				sum=sum+a[j];
				if(sum>max) {
					max=sum;
					f=i;
					l=j;
				}
			}
			
		}
		System.out.println(max);
		
	}
}
