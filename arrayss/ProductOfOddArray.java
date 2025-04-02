package arrayss;

public class ProductOfOddArray {
	public static void main(String[] args) {
//		int a[]={1,2,3,4,5,6,7};
		int a[]={10,2,30,4,50,6,8};

		
		int product=1;
		boolean isOdd=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				product=product*a[i];
			}
			
		}
//		System.out.println("product  of Odd number is :"+product);
		
		if(isOdd) {
			
				System.out.println("Product of odd number is :"+product);
		}else {
			System.out.println("Odd number not found");
		}
		
	}
}
