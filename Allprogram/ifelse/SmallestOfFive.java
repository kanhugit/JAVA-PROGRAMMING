 class SmallestOfFive {
    public static void main(String[] args) {
        int a = 50, b = 20, c = 35, d = 15, e = 45;
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        if (d < smallest) {
            smallest = d;
        }
        if (e < smallest) {
            smallest = e;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}
