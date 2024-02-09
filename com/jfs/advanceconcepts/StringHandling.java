package com.jfs.advanceconcepts;

public class StringHandling {
    public static void main(String[] args) {
//        String s  = "java"; // using literal
//        String s3 = "java";
        String s2 = new String("java");// using new
        String s4 = new String("java");
//        System.out.println(s);
        System.out.println(s2);
//        System.out.println(s == s3);
//        System.out.println(s == s2);
        System.out.println(s2 == s4);
//        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        String s  = "java"; // using literal
        String s3 = "Java";
        String testStr = "world";
        System.out.println(s.equals(s3));
        System.out.println(s.equalsIgnoreCase(s3));
        System.out.println(s.length());
        System.out.println(s+testStr);
//        System.out.println(s.concat(testStr));
        s = s.concat(testStr);
        System.out.println(s);
        s = "hello";
        System.out.println(s);
        System.out.println(s.contains("h"));
        System.out.println(s.substring(0,2));
//        System.out.println(s.substring(0,6));
        System.out.println(s.substring(2));
        String sentence = "Java is a simple programming language";
        String[] splitWords = sentence.split("p"); // {"java", "is", "a", "simple","programming", "language"}
        for(int i=0;i<splitWords.length;i++) { // for(datatype variable: arrayorsequenc)
            System.out.println(splitWords[i]);
        }

        String[] splitWords2 = sentence.split(" ", 3);
        for(String str: splitWords2) {
            System.out.println(str);
        }

        String word = " na\nni ";
        System.out.println(word.length());
        System.out.println(word);
        System.out.println(word.trim());
        System.out.println(word.length());
        word = word.replaceAll("\n", "");
        System.out.println(word.replaceAll("\n", ""));
        System.out.println(word.replace("\n", "java"));
        System.out.println(word.length());
//        String s5 = "python";
        // chartAt  --> returns the character at given index
//        System.out.println(word.charAt(20));
        // indexOf --> it returns the first occurance of the given index
        String str1 = "Prabhas"; // {'p','r', 'a', 'b', 'h', 'a', 's' }
        System.out.println(str1.indexOf("a"));
        System.out.println(str1.indexOf("a",str1.indexOf("a")+1));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        // isEmpty() -->
        String str2 = " ";
        System.out.println(str2.isEmpty());
        str2= null;
        System.out.println(str2.isEmpty());
        if (str2 != null) {

        }

    }
}
