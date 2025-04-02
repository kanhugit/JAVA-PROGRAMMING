 class MiddleOfThree {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 20;
        int middle;

        if ((a > b && a < c) || (a > c && a < b)) {
            middle = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            middle = b;
        } else {
            middle = c;
        }

        System.out.println("The middle number is: " + middle);
    }
}
