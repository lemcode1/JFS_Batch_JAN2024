package com.jfs.advanceconcepts.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Write a csv file data into database table  (Person) on a daily basis every day morning 1AM
 */

class PersonBean {
    String name;
    int age;
    int rollNo;

    public PersonBean(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}';
    }
}
public class ReadCsvFromJava {
    public static void main(String[] args) {
        try{
            List<PersonBean> personList = new ArrayList<>();
            FileReader fileReader = new FileReader("Person_data.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineData = "";
            String header = bufferedReader.readLine(); // this will return first line of csv which is header
            while((lineData = bufferedReader.readLine())!= null) { // reading each line from csv file
//                String[] values = lineData.split(","); //[kasi,29,123]    // splitting using delimeter
                StringTokenizer values = new StringTokenizer(lineData, ",");
//                while(values.hasMoreElements()){
//
//                }
                PersonBean personBean = new PersonBean((String) values.nextElement(), Integer.parseInt((String) values.nextElement()),
                        Integer.parseInt((String) values.nextElement()));  // setting all splitted values to java bean
                personList.add(personBean); // add each bean into arraylist
            }


            for(PersonBean personBean : personList) {
                System.out.println(personBean);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
