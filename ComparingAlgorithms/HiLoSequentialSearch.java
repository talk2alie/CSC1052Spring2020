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
        
        find(number);
    }

    /**
     * Uses the Sequential Search algorithm to find the give number, 
     * starting from 1
     * @param number
     */
    static void find(int number) {
        
    }
}