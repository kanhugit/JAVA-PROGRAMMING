package exception;

 class InvalidAgeException extends Exception {

	public InvalidAgeException(String msg) {
		super(msg);
	}
	
 }	
 
 
 
	public class CustomExceptionExample{
		
		public static void main(String[] args) throws InvalidAgeException {
			
			try {
				int age=15;
				if(age<18) {
					throw new InvalidAgeException("Age must be at least 18.");
				}
				System.out.println("Age is valid");

					
			}catch(InvalidAgeException e) {
				System.out.println("Expection caught :"+e.getMessage());
			}
		}
		
	}

	


