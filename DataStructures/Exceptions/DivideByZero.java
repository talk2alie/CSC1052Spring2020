import java.util.Scanner;

/**
 * This program asks a user for a numerator (the top number in a fraction) 
 * and a denominator (the bottom number in a fraction. This must be above 0)
 */
public class DivideByZero {

    public static void main(String[] args) throws ArithmeticException {
        
        // 1. Create some padding aroud the program's output
        System.out.println();

        // 2. Create a Scanner object to read the user's input
        Scanner keyboard = new Scanner(System.in);

        // 3. Ask the user to enter an integer number for the numerator
        System.out.print("Please enter an integer numerator: ");

        // 4. Get the user's input from the keyboard
        int numerator = keyboard.nextInt();

        // 5. Next, ask the user to enter an integer number for the denominator
        System.out.print("Please enter an integer denominator: ");

        // 6. Get the user's input from the keyboard
        //    Note: A user could enter any integer number here; even 0
        int denominator = keyboard.nextInt();

        // 7. Close the keyboard's stream
        keyboard.close();

        // 8. Divide the numerator by the denominator to calculate the quotient
        //    Note: Because the division statement could cause an error if the 
        //          denominator is 0, we wrap the possible offending statement
        //          in a try block
        int quotient = 0;
        if(denominator != 0 ) {
            quotient = numerator / denominator;
        }
        else {
            throw new DivideByZeroException("Your denominator, " + denominator + ", must be above 0.");
        }

        // 9. Print the result
        System.out.println("The quotient of " + numerator + " and " + denominator + " is " + quotient);

        // 10. Add a bottom padding
        System.out.println();
    }
}

