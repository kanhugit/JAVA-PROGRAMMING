package exception;

import java.io.IOException;

public class CheckedExceptionPropagation {
	public static void main(String[] args) {
		try {
			m1();
		}catch(IOException e) {
			System.out.println("Exception caught in main :"+e);
		}
	}

	public static void m1() throws IOException {
		m2();
	}

	public static void m2() throws IOException {
		m3();
	}

	public static void m3() throws IOException {
	throw new IOException("Checked Exception Thrown");
	}
}


//IOException is a checked exception, so each method must declare it with throws.
//The exception propagates through method3(), method2(), and method1().
//Finally, it is caught in main().
//Checked exceptions must either be caught or declared using throws in the method signature.