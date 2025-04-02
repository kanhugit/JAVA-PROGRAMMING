//WAP TO FIND  THE PRODUCT OF ODD DIGITS OF A GIVEN NUMBER

class Product_Of_Odd_Digits_From_Given_Number{
	public static void main(String[] args){
		int n=521637;
		int product=1;
		while(n>0){
		  int rem=n%10;   //extracting the last digit
		  if(rem%2==1)  //check odd or not
			product=product*rem;


		  n=n/10;        //eleminating the digits
		}
          System.out.println(product);
	}
}