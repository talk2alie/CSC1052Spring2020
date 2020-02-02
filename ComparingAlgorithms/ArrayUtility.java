/**
 * Utility
 */
public class ArrayUtility {

    public static void swap(int left, int right, int[] numbers) {
        int swapHelper = numbers[left];       
        numbers[left]= numbers[right];
        numbers[right]= swapHelper;
    }

    public static void print(int[] numbers) {
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}