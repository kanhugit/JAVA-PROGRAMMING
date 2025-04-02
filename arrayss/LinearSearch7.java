//write a program to print nth occurences in an given array

package arrayss;

public class LinearSearch7 {

	public static void main(String[] args) {
		int a[]= {3,5,2,6,7,2,8,5,2,5,2,8};
		int item=5;
		int n=3;
		int count=0;
		int index=-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==item) {
				index=i;
				count++;
				if(count==n) break;
			}
		}
		if(count==n) {
			System.out.println(n+"th Occurance of element "+item+" at index" +index);
		}else {
			System.out.println(item+"Element not found at occurence  "+n);
		}
	}
}
