class ButterflyPattern{
    public static void main(String[] args){
    int star=1,space=5;

        for(int i=1;i<=7;i++){
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=space;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=star;k++){
                if (k!=4) 
                System.out.print("* ");
                    
            }
                System.out.println();
                if (i<=3) {
                    space-=2;
                    star++;
                }else{
                    star--;
                    space+=2;
                }
            }
        }
    }
