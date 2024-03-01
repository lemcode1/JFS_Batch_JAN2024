package com.jfs.advanceconcepts.filehandling;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo{
    public static void main(String[] args){
        byte[] byteArray = {10,20,30,40};
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            System.out.println("The bytes reading from input stream");
            // available number of bytes
            System.out.println("Available bytes"+byteArrayInputStream.available());
//            for(int i=0; i< byteArray.length; i++) {
//            byteArrayInputStream.skip(2);
//               int numData = byteArrayInputStream.read();
               System.out.println(byteArrayInputStream.read());
            System.out.println(byteArrayInputStream.read());
            System.out.println(byteArrayInputStream.read());
//            }
            System.out.println("Available bytes"+byteArrayInputStream.available());
            byteArrayInputStream.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
