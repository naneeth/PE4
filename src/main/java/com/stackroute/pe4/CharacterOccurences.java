package com.stackroute.pe4;

/*
Write a java program to count the total number of occurrences of a given character in a string without using any loop?
 */
public class CharacterOccurences {
    public int countOfCharacter(String originalString, String repalceString) {
        String outputString = originalString.replaceAll(repalceString, "");
        return (originalString.length() - outputString.length());
    }
}
