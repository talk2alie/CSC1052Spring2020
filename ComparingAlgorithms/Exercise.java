/**
 * xercise
 */
public class Exercise {

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            int left = i;
            for(int j = 0; j < 10; ++j) {
                int right = j;
                System.out.println(left * right);
            }
        }
    }
}