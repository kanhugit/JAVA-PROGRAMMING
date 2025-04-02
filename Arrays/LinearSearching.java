class LinearSearching{

	public static void main(String[] args){
		 int[] a = {5,9,6,3,1,7};
		 int  element=3;
		 int index=-1;
		 for (int i = 0; i < a.length; i++) {
           		 if (a[i]==element) {
              	  		index=i;break;	
                	}
            	}
		if(index!=-1){
		 System.out.println(element+"Element not found");
		}else{
		 System.out.println(element+" is Element found"+index);

		}
        }


	
}