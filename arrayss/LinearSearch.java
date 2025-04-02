package arrayss;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {1,5,8,4,3,6};
		
		int element=8;
		
		int index=-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				index=i; break;
			}
		}
		if(index!=-1) {
			System.out.println("Element is found at index:"+index);
		}else {
			System.out.println("Element is not found ");
		}
	}
}
