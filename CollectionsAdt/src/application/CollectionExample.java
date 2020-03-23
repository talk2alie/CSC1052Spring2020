package application;

import java.util.Scanner;

import implementation.ArrayCollection;

/**
 * CollectionExample
 */
public class CollectionExample {
    static Scanner keyboard = new Scanner(System.in);
    final static int CAPACITY = 10;
    static ArrayCollection<String> words = new ArrayCollection<>(CAPACITY);

    public static void main(String[] args) {
        System.out.println();

        boolean playAgain = false;

        do {
            System.out.print("Please enter D for delete, S for search, and A for add: ");
            char userInput = keyboard.nextLine().toUpperCase().charAt(0);
            switch (userInput) {
                case 'D':
                    playAgain = delete();
                    break;
                case 'S':
                    playAgain = search();
                    break;
                case 'A':
                    playAgain = add();
                    break;
                default: {
                    System.out.println("Your input is invalid.");
                    playAgain = canPlayAgain();
                }
            }
        } while (playAgain);
    }

    private static boolean add() {
        System.out.println();

        System.out.print("Please enter the word you want to add: ");
        String word = keyboard.nextLine();
        if(words.add(word)) {
            System.out.println("Your word, " + word + ", was added successfully");
        } else {
            System.out.println("Your word, " + word + ", was not added");
            System.out.println("The collection might be full");
        }

        return canPlayAgain();
    }

    private static boolean search() {
        System.out.println();

        System.out.print("Please enter word to search: ");
        String word = keyboard.nextLine().trim().toLowerCase();
        if(words.contains(word)) {
            System.out.println("Your word, " + word + ", was found in the collection. Cheers!");
        } else {
            System.out.println("Sorry, your word does not yet exist");
        }

        return canPlayAgain();
    }

    private static boolean delete() {
        System.out.println();

        System.out.print("Please enter word to delete: ");
        String word = keyboard.nextLine().toLowerCase().trim();
        if (words.remove(word)) {
            System.out.println("Your word, " + word + ", was deleted");
        } else {
            System.out.println("Your word, " + word + ", was not found");
        }

        return canPlayAgain();
    }

    private static boolean canPlayAgain() {
        System.out.print("Would you like to play again (Yes or No)? ");
        return keyboard.nextLine().trim().equalsIgnoreCase("Yes");
    }
}