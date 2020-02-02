/**
 * SelectionSort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 5, 4};
        ArrayUtility.print(numbers);

        selectionSort(numbers);
        ArrayUtility.print(numbers);
    }

    static void selectionSort(int[] numbers) {
        for(int currentIndex = 0; currentIndex <= numbers.length - 2; ++currentIndex) {
            int minimumIndex = currentIndex;
            for(int check = currentIndex + 1; check <= numbers.length - 1; ++check) {
                if(numbers[check] < numbers[minimumIndex]) {
                    minimumIndex = check;
                }
            }
            ArrayUtility.swap(currentIndex, minimumIndex, numbers);
        }
    }
}