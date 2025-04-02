//WAP TO FIND  THE REVERSE OF  OF A GIVEN NUMBER

class ReverseOfNumber{
	public static void main(String[] args){
		int n=12345;
		int rev=0;
		while(n>0){
		  int rem=n%10;   //extracting the last digit
		  rev=rev*10+rem;
		   n=n/10;       //eliminating the numbers
		}
	System.out.println(rev);
        }
        }
