class SunnyNumber{
    public static void main(String[] args){

              int n=25;
	      if(sunny(n)){
			System.out.Println(n+"sunny num");

	      }else{
			System.out.Println(n+" not a sunny ");
	      }
    }
		public static boolean sunny(int n){
			
		      int s=n+1;
		
		      while(n!=0){
			if(n%10!=s%10)
				return false;
				n/=10;
				s/=10;
		      }
	          return true;
	        
              }

     }