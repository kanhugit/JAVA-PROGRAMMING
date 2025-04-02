//WAP TO FIND  THE PALINDROME OF A GIVEN NUMBER OR NOT

class PalindromeNumber{
	public static void main(String[] args){
		int n=15351;
		int temp=n;
		int rev=0;
		while(n!=0){
		  int rem=n%10;   //extracting the last digit
		  rev=rev*10+rem;
	          n/=10;
		} 
		if(rev==temp){
		    System.out.println(rev+"is a palindrome");
		}else{
		    System.out.println(rev+ " is not palindrome");
		}	  		         
		   
        }
	
}
