class GCD{
  
    public static void main(String[] args){
	 int a=8,b=24;
		
	  int min=(a>b)?b:a;
		for(int i=min;i>=1;i--){
		      if(a%i==0&&b%i==0){
				System.out.println(i);
                                           break;
			}	
		}
    }

}