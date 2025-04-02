 class SmallestOfFour {
    public static void main(String[] args) {
        int a = 12, b = 34, c = 23, d = 9;
        int smallest = (a < b) ? (a < c ? (a < d ? a : d) : (c < d ? c : d)) 
                               : (b < c ? (b < d ? b : d) : (c < d ? c : d));
        System.out.println("The smallest number is: " + smallest);
    }
}
