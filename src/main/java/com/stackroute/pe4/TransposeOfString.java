package com.stackroute.pe4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransposeOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
       System.out.println(transpose(str));
    }
    public static String transpose(String s){
        if(s.trim()==""||s==null) {
            return null;
        }
            else{
            }
            String[] words = s.split(" ");
            String str = "";
            for (String item : words) {
                StringBuffer sbf = new StringBuffer(item);
                sbf.reverse();
                str += sbf.toString() + " ";
            }
            return str.trim();
        }
    }

