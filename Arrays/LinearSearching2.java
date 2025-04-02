class LinearSearching2{

	public static void main(String[] args){
		 int[] a = {5,6,8,4,8,3,1,8,3};
		 int  element=8;
		 int f=-1,l=-1;
		 int index=-1;
		 for (int i = 0; i < a.length; i++) {
           		 if (a[i]==element) {
              	  		
				if(f==-1)
				    f=i;
				l=i;	
                	}
            	}
		if(index!=-1){
		 System.out.println(element+"Element not found");
		}else{
		 System.out.println("The first occurence of"+element+"is at index:"+f+ ","+"The last occurence of"+element+"is at index:"+l);

		}
        }


	
}