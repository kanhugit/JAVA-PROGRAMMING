package exception;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		try {
			int[] arr= {1,2,3};
			System.out.println(arr[3]);
			
			try {
				int res=10/0;
				System.out.println(res);
			}catch(ArithmeticException q) {
				System.out.println("Inner catch :Division by zero");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer catch:Array index out of bounds");
		}
		
	
	}
}
