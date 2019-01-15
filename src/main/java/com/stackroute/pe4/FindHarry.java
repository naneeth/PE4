package com.stackroute.pe4;

/*
Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
 */
public class FindHarry {
    public String findingHarry(String inputString) {
        if (inputString == null) {
            return null;
        } else {
            boolean b = false;
            String[] words = inputString.split("[ ,.]");
            for (String item : words) {
                if (item.equals("Harry")) {
                    b = true;
                    break;
                }
            }
            if (b) {
                return "Is Harry here ?" + b;
            } else {
                return "Is Harry here ?" + b;
            }
        }
    }
}
