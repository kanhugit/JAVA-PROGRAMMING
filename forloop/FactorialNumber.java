class 	FactorialNumber{
	public static void main(String[] args){
	
	int m = 2, n = 5;
    
        for (int i = m; i <= n; i++) {
		int fact=i;
            for (int j = 1; j <= i; j++) { 
		fact=fact*j;
            } 
            System.out.println(fact); 
        }
    }
}
	


	
 

