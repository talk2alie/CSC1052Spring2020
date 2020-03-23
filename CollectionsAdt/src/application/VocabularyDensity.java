package application;

import java.util.Scanner;

import implementation.ArrayCollection;

/**
 * VocabularyDensity
 */
public class VocabularyDensity {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Please eneter some text:");
        final String text = "The quick brown fox jumps over the lazy dog.";

        ArrayCollection<String> words = new ArrayCollection<>(text.length());
        int wordsInText = 0;

        Scanner stream = new Scanner(text);
        stream.useDelimiter("\\s+");
        while(stream.hasNext()) {   
            String word = stream.next();
            word = word.toLowerCase();
            if(!words.contains(word)) {
                words.add(word);
            }
            wordsInText++;
        }

        double vocabularyDensity = (double) wordsInText / words.size();
        System.out.println("Total words in Text: " + wordsInText);
        if(words.size() == wordsInText) {
            System.out.println("Every word in the text is unique");
        } else {
            System.out.println("Unique Words: " + words.size());
        }

        System.out.println("Vocabulary Density: " + vocabularyDensity);

        stream.close();
        System.out.println();
    }
}