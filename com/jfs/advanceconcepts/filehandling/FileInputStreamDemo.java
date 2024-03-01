package com.jfs.advanceconcepts.filehandling;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        byte[] array = new byte[100];

//        InputStream inputStream = new FileInputStream("test_inputstream.txt");
//        System.out.println("Availabel bytes data in the file "+inputStream.available());
//
//        inputStream.read(array);
        InputStream inputStream = new FileInputStream("test_inputstream.txt");
        int i = inputStream.read();
        System.out.println((char)i);


       /* OutputStream outputStream = null;
        // Writing the data to a file using FileOutputStream
        try{
            String javaQuote = "Write once and read anywhere";
            outputStream = new FileOutputStream("test_inputstream.txt");
            byte[] stringBytes = javaQuote.getBytes();

            outputStream.write(stringBytes);  // to write byte data in to the file

        } catch(IOException io) {
            System.out.println("Exception while writing teh data");
        } finally {
            if(outputStream !=null) {
                outputStream.close(); // to close the output stream, otherwise file will be corrupted or it wont be written to the file
            }
        }*/

    }
}
