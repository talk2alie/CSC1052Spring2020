/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        System.out.println("Before: ");
        ArrayUtility.print(numbers);

        System.out.println();
        reverse(numbers);

        System.out.println("After:");
        ArrayUtility.print(numbers);
    }

    private static void reverse(int[] numbers) {    
        for(int front = 0, back = numbers.length - 1; front < back; front++, back--) {
            swap(front, back, numbers);
        }
    }

    static void swap(int left, int right, int[] numbers) {}
}