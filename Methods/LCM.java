class LCM{
  
    public static void main(String[] args){
	 int a=14,b=8;
		
	  int max=(a>b)?a:b;
		int lcm=max;
		int k=2;
		while(true){
		  if(lcm%a==0&&lcm%b==0){
			System.out.println(lcm);
                                 break;
		  }

			lcm=max*k++;
		}
		
          }

}