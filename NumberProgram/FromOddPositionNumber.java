//WAP TO FROM  A NUMBER USING ODD POSITION DIGITS FROM GIVEN NUMBER?

class FromOddPositionNumber {
    public static void main(String[] args) {
        int n = 538672;
        int res = 0,c=0, p = 1;
	int temp=n;

        while (n != 0) {
            int r = n % 10; // Extracting the last digit
		c++;
		n/=10;      //eliminateing
	}
            while (temp!=0) { 
		if(c%2==1){
		   int r=temp%10;
		   res = r * p + res;
                   p = p * 10;

		}
	     c--;
	     temp/=10;

            }

        System.out.print(res);
    }
}
