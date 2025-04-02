package arrayss;
public class LinearSearch5 {

	public static void main(String[] args) {
		int a[]= {4,3,1,5,-1,6,3,1,2};
		int target=5;
		int count=0;
		
        System.out.println("Pairs with sum with no repeat " + target + ":");

		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]!=0 && a[i]!=0) {
					if((a[i]+a[j]==target)) {
						count++;
						System.out.println( "("+ a[i]+"," +a[j] +")");
						a[j]=0;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
