public class PrimeNumber {
    public static void checkPrime() {
            int num=14,count=0;
            for(int i=1;i<=num;i++){
                if (num%i==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println("it is a prime number");
            }else{
                System.out.println("it is not a prime number");
            }
    }
    public static void main(String[] args) {
        checkPrime();
    }
}
