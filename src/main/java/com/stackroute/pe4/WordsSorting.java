package com.stackroute.pe4;

/*
Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words
 */
import java.util.Arrays;

public class WordsSorting {
    public static String wordsSorting(String inputString) {
        if (inputString.trim() == "") {
            return null;
        } else {
            String[] words = inputString.split(" ");
            Arrays.sort(words);
            String outputString = "";
            for (int i = 0; i < words.length; i++) {
                outputString += words[i] + " ";
            }
            return outputString.trim();
        }
    }
}
