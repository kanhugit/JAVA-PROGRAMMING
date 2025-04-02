public class bubblesort1 {
    public static void main(String[] args) {
        int a[]={5,2,3,8,7,6,12,4,9};
        // int[] tempArray = new int[];
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i;j++){

                if (a[j]>a[j+1]) {
                    if(a[j]%2==0){
                        System.out.println("The even number of arrays is :"+a[j]);
                    }else{
                        System.out.println("The odd number order is o");
                    }
                }
            }
        }
    }
}
