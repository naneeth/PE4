package com.stackroute.pe4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CharacterOccurences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
       String str = br.readLine();
        String c =br.readLine();
        System.out.println(countOfCharacter(str,c));
    }


    public static int countOfCharacter(String s,String c){
     String str = s.replaceAll(c,"");
     return (s.length()-str.length());
    }
}
