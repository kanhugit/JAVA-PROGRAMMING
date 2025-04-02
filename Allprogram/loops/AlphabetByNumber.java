 class AlphabetByNumber {
    public static void main(String[] args) {
        int number = 5; 


        if (number < 1 || number > 26) {
            System.out.println("Invalid input. Please enter a number between 1 and 26.");
            return; 
        }

        char alphabet = (char) ('A' + number - 1); 
        
        System.out.println("The alphabet corresponding to " + number + " is: " + alphabet);
    }
}
