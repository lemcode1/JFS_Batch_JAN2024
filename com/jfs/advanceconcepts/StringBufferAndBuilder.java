package com.jfs.advanceconcepts;

public class StringBufferAndBuilder {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("java");
        stringBuffer.append("world");
        System.out.println(stringBuffer);
        stringBuffer.insert(4, " is my ");
        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.replace(4, 8, "python"));
        System.out.println(stringBuffer.deleteCharAt(13));
        System.out.println(stringBuffer.delete(8,13));
        String s = stringBuffer.toString();
        System.out.println(s);

        // StringBuilder

    }
}
