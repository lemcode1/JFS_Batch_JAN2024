package com.jfs.advanceconcepts;

import java.util.Scanner;

public class StringExcercies {
    public static String reverseString(String word) {
        String tempRevStr = "";
        for(int i=word.length() - 1; i>=0 ; i--) {
            tempRevStr = tempRevStr + word.charAt(i);
        }
        return tempRevStr;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //"java"
         String outStr = "";
//        StringBuffer sb = new StringBuffer(s);
//        System.out.println(sb.reverse());
//        for(int i=s.length() - 1; i>=0 ; i--) {
//            outStr = outStr + s.charAt(i);
//        }
//        System.out.println(outStr);

        // reverse words of the string
        // input: java is my world
        // output : avaj si ym dlrow
//        String[] splitWords = s.split(" ");
//        for(String word : splitWords) {
//            String reversedWord = reverseString(word);
//            outStr = outStr + reversedWord + " ";
//        }
//
//        System.out.println(outStr.trim());

        // WAP to remove duplicate character in the string
        for (int i=0; i<s.length(); i++) {
            Character ch = s.charAt(i);
            if (outStr.contains(ch.toString())) {
                continue;
            }
            outStr = outStr + s.charAt(i);
        }
        System.out.println(outStr);
    }
}
//java is my world
//dlrow ym si avaj

// java is my world
// avaj si ym dlrow


