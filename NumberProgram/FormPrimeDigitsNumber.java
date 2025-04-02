 //WAP TO FROM  A NUMBER USING PRIME DIGITS IN GIVEN A NUMBER?

class FormPrimeDigitsNumber {
    public static void main(String[] args) {
        int n = 538672;
        int res = 0, p = 1;

        while (n != 0) {
            int r = n % 10; // Extracting the last digit
	    int count=0;
            for (int i=2;i<=r/2;i++) { // Check if the digit is prime
                
		if(r%i==0){
		   count++;break;
		}
            }
            
          if(count==0&&r>1){
	     res=r*p+res;
	     p*=10;
	  } 
	  n/=10; 
        }

        System.out.println(res);//
    }
}
