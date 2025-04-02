 class LargestOfFive {
    public static void main(String[] args) {
        int a = 10, b = 45, c = 30, d = 25, e = 60;
        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        if (d > largest) {
            largest = d;
        }
        if (e > largest) {
            largest = e;
        }

        System.out.println("The largest number is: " + largest);
    }
}
