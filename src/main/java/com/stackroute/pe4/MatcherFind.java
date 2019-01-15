package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Write a program to find out the multiple occurrences of the given word in a string using Matcher methods
 */
public class MatcherFind {
    public String matcher(String s1, String s2) {
        Pattern pattern = Pattern.compile(s2);
        Matcher matcher = pattern.matcher(s1);
        String outputString = "";
        while (matcher.find()) {
            outputString = outputString + "Found at:" + matcher.start() + "-" + matcher.end() + "\n";
        }
        return outputString.trim();
    }
}
