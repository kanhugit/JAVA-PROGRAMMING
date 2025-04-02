 class ASCIICheck {
    public static void main(String[] args) {
        char ch = 'A';
        int asciiValue = (int) ch;
        if (asciiValue % 2 == 0) {
            System.out.println("The ASCII value of " + ch + " is even.");
        } else {
            System.out.println("The ASCII value of " + ch + " is odd.");
        }
    }
}
