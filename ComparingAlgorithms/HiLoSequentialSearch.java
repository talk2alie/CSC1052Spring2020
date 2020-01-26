import java.util.Random;

public class HiLoSequentialSearch {

    public static void main(String[] args) {

        // Create a random number object to select Alice's number at random
        Random random = new Random();

        // Alice says her number is between 1; low, and 1000; high
        final int low = 1;
        final int high = 1000;

        // Randomly select Alice's number between 1 and 1000 (Hope you remember this from 1051)
        int number = random.nextInt(high) + low;
        System.out.println();

        // Just some Announcements to see what Alice's number was before we run the search
        System.out.println("Alice's number is: " + number);
        System.out.println("Let's see how many tries it will take to find Alice's number");
        System.out.println("Using Sequential Search...");
        System.out.println("------------------------------------------------------------");
        System.out.println();
        
        // Here, we are calling the method you implemented
        find(number);
    }

    /**
     * Exercise 12:
     * Uses the Sequential Search algorithm to find the give number, 
     * starting from 1. It should continuously print out each guess
     * as defined by the algorithm
     * @param number
     */
    static void find(int number) {
        int guess = 0;

        do {
            guess++;
            System.out.println("My current guess is: " + guess);
        } while(guess != number);
    }
}

