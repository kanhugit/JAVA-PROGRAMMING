public class FindNumberOfTwos {
    public static void main(String[] args) {
        int count=0;
        for(int i=10;i<=200;i++){
            int s=i;
            while (s!=0) {
                int r=s%10;
                if (r==2) {
                    count++;
                    break;
                }
                s=s/10;
            }
        }
        System.out.println(count);
    }
}
