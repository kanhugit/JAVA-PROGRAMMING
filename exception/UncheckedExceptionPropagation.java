package exception;

public class UncheckedExceptionPropagation {
	public static void main(String[] args) {
		
		try {
			method1();
		}catch(ArithmeticException e){
			System.out.println("Exception caught in main:"+e);
			
		}
	}
	public static void method1() {
		method2();	//propagates to method1()
	}
	public static void method2() {
		method3();	//propagates to method2
	}
	public static void method3() {
		int res=10/0;//throws ArithmeticException
	}
}

//ArithmeticException is thrown in method3().
//It propagates back through method2() and method1().
//Finally, it is caught in main().
//Unchecked exceptions automatically propagate up the call stack if not caught.