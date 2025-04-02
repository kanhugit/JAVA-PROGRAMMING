 class LargestOfSeven {
    public static void main(String[] args) {
        int a = 7, b = 18, c = 6, d = 12, e = 34, f = 9, g = 25;
        int largest = (a > b) ? (a > c ? (a > d ? (a > e ? (a > f ? (a > g ? a : g) : (f > g ? f : g)) 
                                                        : (e > f ? (e > g ? e : g) : (f > g ? f : g))) 
                                             : (d > e ? (d > f ? (d > g ? d : g) : (f > g ? f : g)) 
                                                      : (e > f ? (e > g ? e : g) : (f > g ? f : g)))) 
                                      : (c > d ? (c > e ? (c > f ? (c > g ? c : g) : (f > g ? f : g)) 
                                                        : (e > f ? (e > g ? e : g) : (f > g ? f : g))) 
                                               : (d > e ? (d > f ? (d > g ? d : g) : (f > g ? f : g)) 
                                                        : (e > f ? (e > g ? e : g) : (f > g ? f : g))))) 
                            : (b > c ? (b > d ? (b > e ? (b > f ? (b > g ? b : g) : (f > g ? f : g)) 
                                                        : (e > f ? (e > g ? e : g) : (f > g ? f : g))) 
                                             : (d > e ? (d > f ? (d > g ? d : g) : (f > g ? f : g)) 
                                                      : (e > f ? (e > g ? e : g) : (f > g ? f : g)))) 
                                      : (c > d ? (c > e ? (c > f ? (c > g ? c : g) : (f > g ? f : g)) 
                                                        : (e > f ? (e > g ? e : g) : (f > g ? f : g))) 
                                               : (d > e ? (d > f ? (d > g ? d : g) : (f > g ? f : g)) 
                                                        : (e > f ? (e > g ? e : g) : (f > g ? f : g)))));
        System.out.println("The largest number is: " + largest);
    }
}
