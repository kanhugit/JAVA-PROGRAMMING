//sum of factorials of numbers from m to n ;

class 	FactorialSum{
	public static void main(String[] args){
	
	int m=2,n=6,sum=0;
	for(int i=m;i<=n;i++){
		
		int fact=1;
		for(int j=1;j<=i;j++){
			fact=fact*j;
		}		
		sum+=fact;
        }
	System.out.println("sum of factorial numbers from :" +m+"to"+n+"==>"+sum);
}}
