 class SmallestOfSeven {
    public static void main(String[] args) {
        int a = 7, b = 3, c = 19, d = 12, e = 4, f = 21, g = 1;
        int smallest = (a < b) ? (a < c ? (a < d ? (a < e ? (a < f ? (a < g ? a : g) : (f < g ? f : g)) 
                                                        : (e < f ? (e < g ? e : g) : (f < g ? f : g))) 
                                             : (d < e ? (d < f ? (d < g ? d : g) : (f < g ? f : g)) 
                                                      : (e < f ? (e < g ? e : g) : (f < g ? f : g)))) 
                                      : (c < d ? (c < e ? (c < f ? (c < g ? c : g) : (f < g ? f : g)) 
                                                        : (e < f ? (e < g ? e : g) : (f < g ? f : g))) 
                                               : (d < e ? (d < f ? (d < g ? d : g) : (f < g ? f : g)) 
                                                        : (e < f ? (e < g ? e : g) : (f < g ? f : g))))) 
                            : (b < c ? (b < d ? (b < e ? (b < f ? (b < g ? b : g) : (f < g ? f : g)) 
                                                        : (e < f ? (e < g ? e : g) : (f < g ? f : g))) 
                                             : (d < e ? (d < f ? (d < g ? d : g) : (f < g ? f : g)) 
                                                      : (e < f ? (e < g ? e : g) : (f < g ? f : g)))) 
                                      : (c < d ? (c < e ? (c < f ? (c < g ? c : g) : (f < g ? f : g)) 
                                                        : (e < f ? (e < g ? e : g) : (f < g ? f : g))) 
                                               : (d < e ? (d < f ? (d < g ? d : g) : (f < g ? f : g)) 
                                                        : (e < f ? (e < g ? e : g) : (f < g ? f : g)))));
        System.out.println("The smallest number is: " + smallest);
    }
}
