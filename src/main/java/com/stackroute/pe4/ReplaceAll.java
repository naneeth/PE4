package com.stackroute.pe4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceAll {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(replaceAll(str));
    }
    public static String replaceAll(String s){
        if(s==null){
            return null;
        }
        else{
        s = s.replaceAll("d","f");
        s = s.replaceAll("l","t");
        return s;
    }
    }
}
