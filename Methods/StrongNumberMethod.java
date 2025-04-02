//WAP TO CHECK THE GIVEN NUMBER IS STRONG NUMBER OR NOT ?

class StrongNumberMethod{

	public static void strongNumber(){
		int n=145,sum=0;
		int temp=n;
		while(n!=0){
			
			int r=n%10;  //extracting the number
			int fact=1;  
			
			for(int i=1;i<=r;i++){
			    fact=i*fact;
			}
		 sum+=fact; //120 ,24,1
		 n/=10;  //Eliminating the digits
		}

		if(temp==sum){
		   System.out.println("It is a strong number");
		}else{
		   System.out.println("It is a strong number");

		}
		
	}

	public static void main(String[] args){
		strongNumber();
	}
}