public class ContainTwo {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<=80;i++){
            int s=i;
            while (s!=0) {
                int r=s%10;
                if(r==2){
                    count++;
                    break;
                }
                s=s/10;
            }
        }
        System.out.println(count);
    }
}
