package arrayss;

import java.util.Arrays;

public class EvenArray {
	public static void main(String[] args) {
		int a[]= {5,3,32,7,8,2,8,20,45};
		int c=0;
		for(int i:a) {
			if(i%2==0) {
				c++;
			}
		}
		int res[]=new int[c];
		int j=0;
		for(int i=0;i<a.length;i++) {   
			if(a[i]%2==0) {
				res[j++]=a[i];
			}
		}
	
//		int j=0;
//		for(int i:a) {
//			if(i%2==0) {
//				res[j++]=i;
//			}
//		}
		System.out.println(Arrays.toString(res));

	}
}
