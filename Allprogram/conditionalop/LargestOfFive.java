 class LargestOfFive {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5, d = 15, e = 25;
        int largest = (a > b) ? (a > c ? (a > d ? (a > e ? a : e) : (d > e ? d : e)) 
                                       : (c > d ? (c > e ? c : e) : (d > e ? d : e))) 
                              : (b > c ? (b > d ? (b > e ? b : e) : (d > e ? d : e)) 
                                       : (c > d ? (c > e ? c : e) : (d > e ? d : e)));
        System.out.println("The largest number is: " + largest);
    }
}
