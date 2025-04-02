package binarysearch;

public class MaxSumArray {
	
	
	public static void main(String[] args) {
		int a[]= {5,-7,8,3,4,-6,7,-9,4};
		int max=Integer.MIN_VALUE;
		int f=-1;
		int l=-1;
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
		for(int i=f;i<=1;i++) {
			System.out.println(a[i]+" ");
		}
		
	}

}
