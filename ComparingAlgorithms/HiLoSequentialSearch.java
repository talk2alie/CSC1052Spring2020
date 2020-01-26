import java.util.Random;

public class HiLoSequentialSearch {

    public static void main(String[] args) {

        Random random = new Random();
        final int low = 1;
        final int high = 1000;
        int number = random.nextInt(high) + low;
        System.out.println();

        System.out.println("Alice's number is: " + number);
        System.out.println("Let's see how many tries it will take to find Alice's number");
        System.out.println("Using Sequential Search...");
        System.out.println("------------------------------------------------------------");
        System.out.println();
        
        find(number, high);
    }

    static void find(int number, int high) {
        // Set guess to 0
        int guess = 0;
        do {
            // Increment guess by 1
            guess++;

            // Announce Guess
            System.out.println("My current guess is: " + guess);
        } while(guess != number);
    }
}