package exception;

public class ExceptionPropagation {

	public static void main(String[] args) throws Exception {
		try {
			m1();
		}catch(Exception e) {
			System.out.println("Exception Caught in main:"+e);
		}
	}
	
	public static void m1() throws Exception {
		try {
			m2();
		}catch(ArithmeticException e) {
			System.out.println("Handled AritmeticException in m1");
		}
	}
	public static void m2() throws Exception {
		m3();
	}
	public static void m3() throws Exception{
		throw new Exception("General Exception from M3");
	}
}
//method1() catches ArithmeticException, but the general Exception propagates up to main().
//main() catches the propagated Exception.