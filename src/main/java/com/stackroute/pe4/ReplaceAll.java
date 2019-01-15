package com.stackroute.pe4;

/*
Write a program to replace all d with f and all l with t in the given String
 */
public class ReplaceAll {
    public static String replaceAll(String originalString) {
        if (originalString == null) {
            return null;
        } else {
            originalString = originalString.replaceAll("d", "f");
            originalString = originalString.replaceAll("l", "t");
            return originalString;
        }
    }
}
