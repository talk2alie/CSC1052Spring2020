import java.util.Random;

public class HiLoBinarySearch {

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
         find(number, high);
    }

    /***
     * Uses the Binary search algorithm to find the given number,
     * starting from 1 to the given n
     * @param number - The number to find
     * @param n - The highest number in a range from 1 to n
     */
    static void find(int number, int n) {
        // Set range to 1 ... N
        int low = 1;
        int high = n;
        int guess;
        
        do {
            // Set guess to middle of range
            guess = (low + high) / 2;

            // Anounce guess
            System.out.println("My current guess is: " + guess);
            if(guess > number) {
                // Set range to first half of range
                high = ((low + high) / 2) - 1;
            }

            if(guess < number) {
                // Set range to second half of range
                low = ((low + high) / 2) + 1;
            }
        } while (guess != number);
    }
}