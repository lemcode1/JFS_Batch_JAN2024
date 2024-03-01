package com.jfs.advanceconcepts.filehandling;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class FileDemo {
    public static void main(String []args) throws IOException {
        File fileObj = null;
        Scanner reader = null;
        FileWriter fileWriter = null;
        try {
//             fileObj = new File("C:\\Users\\kasiy\\Desktop");
            fileObj = new File("test_inputstream.txt");
            System.out.println(fileObj.exists());
            System.out.println(fileObj.isFile());
//            File[] file = fileObj.listFiles();
//            for(File f : file) {
//                System.out.println(f.getName());
//            }

            if(fileObj.createNewFile()) {
                System.out.println("File created : ");
            } else {
                System.out.println("File is already exist");
            }

            // Reading a file using FileReader
//            FileReader fileReader = new FileReader("test_file.txt");
//            fileReader.read();
//            reader = new Scanner(fileObj);
//            while(reader.hasNextLine()) {
//                String name = reader.nextLine();
//                System.out.println("Name :"+name);
//            }

            // Writing the data to a file
//            fileWriter = new FileWriter("test_file.txt");
//            fileWriter.write("java\n");
//            fileWriter.write("python");
//            if(fileObj.delete()) {
//                System.out.println("file is deleted: " +fileObj.getName());
//            } else {
//                System.out.println("Failing to delte the file");
//            }

//            fileObj.deleteOnExit();
            fileObj.delete();
//            System.exit(0);
            System.out.println("After delete on exit");
            System.out.println("After delete on exit1");
            System.out.println("After delete on exit2");
            System.out.println("After delete on exit3");

        } catch (IOException io) {
            System.out.println("Exception occuring while working with a file :"+io.getMessage());
        } finally {
            if(reader!=null)
                reader.close();
            if(fileWriter!=null)
                fileWriter.close();
        }
    }
}
