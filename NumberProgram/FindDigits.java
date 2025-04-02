//WAP TO FIND ALL THE DIGITS FROM A GIVEN NUMBER

class FindDigits{
	public static void main(String[] args){
		int n=1234;
		while(n>0){
		  int rem=n%10;   //extracting the last digit
		  System.out.println(rem);
		  n=n/10;        //eleminating the digits
		}
        }
}