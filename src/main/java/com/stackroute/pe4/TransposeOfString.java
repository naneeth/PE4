package com.stackroute.pe4;

/*
Write a program to transpose the given string.
 */
public class TransposeOfString {

    public static String transpose(String inputString) {
        if (inputString.trim() == "" || inputString == null) {
            return null;
        } else {
            String[] words = inputString.split(" ");
            String outputString = "";
            for (String item : words) {
                StringBuffer stringBuffer = new StringBuffer(item);
                stringBuffer.reverse();
                outputString += stringBuffer.toString() + " ";
            }
            return outputString.trim();

        }
    }
}

