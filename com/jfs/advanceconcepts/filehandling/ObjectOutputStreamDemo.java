package com.jfs.advanceconcepts.filehandling;

import java.io.*;

// serialization
public class ObjectOutputStreamDemo {
    public static void main(String []args) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            String strData = "we are discussing serialization";
            fileOutputStream = new FileOutputStream("file.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeInt(123456);
            objectOutputStream.writeObject(strData);

            // reads data using objectgintputstream
            FileInputStream fileInputStream = new FileInputStream("file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println("Integer value from file :"+objectInputStream.readInt());
            System.out.println("String value from file :"+objectInputStream.readObject());


        } catch (IOException | ClassNotFoundException ie) {
            ie.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            }catch(IOException ie) {
                ie.printStackTrace();
            }
        }
    }
}
