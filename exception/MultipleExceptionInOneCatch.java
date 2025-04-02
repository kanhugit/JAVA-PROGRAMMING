package exception;

public class MultipleExceptionInOneCatch {

	public static void main(String[] args) {
		try {
			int res=10/0;
			String s=null;
			s.length();
		}catch(ArithmeticException|NullPointerException e) {
			System.out.println("Exception caught:"+e);
		}
	}

}
