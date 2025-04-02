class Automorphic{
    public static void main(String[] args){

              int n=25;
	      if(automorphic(n)){
			System.out.println(n+"automorphic num");

	      }else{
			System.out.println(n+" not a automorphic ");
	      }
    }
		public static boolean automorphic(int n){
			
		      int s=n*n;
		
		      while(n!=0){
			if(n%10!=s%10)
				return false;
				n/=10;
				s/=10;
		      }
	          return true;
	        
              }

     }