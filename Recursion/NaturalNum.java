//write a program to print the 5 natural number using recusion 

class NaturalNum{
	public static int numbers(int n){
		if(n<=5){
		System.out.println(n);// Print current number
		return numbers(n+1);// Recursively call numbers with n+1
		}else{
		return n;// Return when n is greater than 5 to avoid missing return error
		}
		
	}
	public static void main(String[] args){
		//System.out.println(numbers(1));
		numbers(1);// Start the sequence from 1 (or any number less than 5)
	
	}

}



 //class NaturalNum {
//    public static void numbers(int n) {
//         if (n <= 5) {
 //           System.out.println(n);
 //           numbers(n + 1);  // Recursive call to print the next number
 //       }
 //   }

 //   public static void main(String[] args) {
//        numbers(1);  // Start from 1 to print natural numbers up to 5
 //   }
//}
