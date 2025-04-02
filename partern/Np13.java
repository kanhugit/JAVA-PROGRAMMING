public class Np13 {
    public static void main(String[] args) {
        int p=0;
      for(int i=1;i<=5;i++){
        int c=p+i;
        p=c;
        for(int j=1;j<=i;j++){
            System.out.print(c-- +"");
        }
        System.out.println();
      }
    
    }    
}
