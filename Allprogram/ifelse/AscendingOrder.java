 class AscendingOrder {
    public static void main(String[] args) {
        int a = 25, b = 10, c = 35;
        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Numbers in ascending order: " + a + ", " + b + ", " + c);
    }
}
