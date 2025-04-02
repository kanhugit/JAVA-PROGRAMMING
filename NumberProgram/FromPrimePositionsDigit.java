//WAP TO FORM NUMBER USING PRIME POSITION DIGITS FROM GIVEN NUMBER?

class FromPrimePositionsDigit {
    public static void main(String[] args) {
        int n = 538672;
        int res = 0, s = 0,c=0;

        while (n != 0) {
            int r = n % 10; // Extracting the last digit
	    s=s*10+r;
	    c++;
	    n/=10;
	}
	int position=0;
            while (s!=0) { 
               int r = s%10;
               position++;
               for(int i=1;i<=c;i++){
		    {
			int count=0;
			for(int j=2;j<=(i/2);j++){
				if(i%j==0){
				count++;break;
				}
			}
		  if(count==0&&i>1){
			if(i==position)
			   res=res*10+r;
		  }
   
	       }
		s=s/10;
            }
        System.out.print(res);
    }
}}
