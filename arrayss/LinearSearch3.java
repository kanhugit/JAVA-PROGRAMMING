package arrayss;

public class LinearSearch3 {
	public static void main(String[] args) {

		int[] x= {18,20,3,6,9,0,2,6,9,20,40,27,40,50,60};
		
		int element=40;
		int index=-1;
		
		for(int i=0;i<x.length;i++) {
			
			if(x[i]==element) {
				index=i;break;//if we use break statement then we will get only first occurences
			}
		}
		if(index!=-1) {
			System.out.println("Element found at index :"+index);
		}else {
			System.out.println("Element is not found ");
		}
		
	}
}
