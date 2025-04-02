//wap to print the pair of sum of two number is 5  

package arrayss;

public class LinearSearch6 {
	
public static void main(String[] args) {
		
        int[] a = {4,1,3,5,0,5,3,2,6,-1,2,3,2};
        int target = 5;
        int count=0;

        System.out.println("Pairs with sum " + target + ":");

        
        for (int i = 0; i < a.length-1; i++) {
           
            	
                if (a[i] + a[i+1] == target) {
                	count++;
                    System.out.println("(" + a[i] + ", " + a[i+1] + ")");
                    i++;
                }   
        }
        System.out.println(count);
    }

}
