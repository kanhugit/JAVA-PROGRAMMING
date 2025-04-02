public class Np12 {
    public static void main(String[] args) {
        int space=3,num=1;
        for(int i=1;i<=7;i++){
            int n=1;
            for(int j=1;j<=3;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print(num);
            }
            System.out.println();
            if (i<=1) {
                space--;
                num++;
            }else{
                space++;
                num--;
            }
        }
    }
}
