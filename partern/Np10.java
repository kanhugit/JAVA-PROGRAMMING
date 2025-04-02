public class Np10 {
    public static void main(String[] args) {
        int space=3,one=1;
        for(int i=1;i<=4;i++){
            int n=1;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=4;k++){
                if(k<=one)
                 System.out.print(n++ +" ");
                 else
                  System.out.print(n-- +" ");
            }
            System.out.println();
            space--;
            n+=2;
        }
    }
}
