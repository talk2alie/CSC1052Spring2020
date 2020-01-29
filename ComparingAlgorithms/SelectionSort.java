/**
 * SelectionSort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {15, 10, 17, 3, 12, 0, 19, 12, 33, 9};
        print(numbers);

        selectionSort(numbers);
        print(numbers);
    }

    static void print(int[] numbers) {
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    static void selectionSort(int[] numbers) {
        for(int i = 0; i < numbers.length; ++i) {
            int currentIndex = i;
            int minimumINdex = i;
            for(int j = i + 1; j < numbers.length; ++j) {
                if(numbers[j] < numbers[minimumINdex]) {
                    minimumINdex = j;
                }
            }
            swap(currentIndex, minimumINdex, numbers);
        }
    }

    private static void swap(int currentIndex, int minimumINdex, int[] numbers) {
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[minimumINdex];
        numbers[minimumINdex] = temp;
    }
}