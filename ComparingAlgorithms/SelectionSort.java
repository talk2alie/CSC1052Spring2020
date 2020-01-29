/**
 * SelectionSort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 5, 4};
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
        for(int currentIndex = 0; currentIndex <= numbers.length - 2; ++currentIndex) {
            int minimumIndex = currentIndex;
            for(int check = currentIndex + 1; check <= numbers.length - 1; ++check) {
                if(numbers[check] < numbers[minimumIndex]) {
                    minimumIndex = check;
                }
            }
            swap(currentIndex, minimumIndex, numbers);
        }
    }

    private static void swap(int currentIndex, int minimumINdex, int[] numbers) {
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[minimumINdex];
        numbers[minimumINdex] = temp;
    }
}