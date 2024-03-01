package com.jfs.advanceconcepts.collections;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
//    private static final String DATABASE_USERNAME = "kasi";
//    private static final String DATABASE_PASSWORD = "Test@123";
    public static void main(String []args) throws Exception {
        // Creating a reader oject to read properties file
//        FileReader reader = new FileReader("C:\\Users\\kasiy\\IdeaProjects\\JFS_Batch_JAN2024\\com\\jfs\\advanceconcepts\\collections\\database.properties");
        Properties properties = new Properties();
        properties.put("db_username", "lsadfjasd");
//        properties.load(reader);

        System.out.println("Database username is : "+properties.getProperty("db_username"));
        System.out.println("Database password is : "+properties.getProperty("db_password"));


        // To get all the system properties
        Properties systemProps = System.getProperties();

        Set<Map.Entry<Object, Object>> set = systemProps.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println("key is "+entry.getKey()+ " value is : "+entry.getValue());
        }
    }

}
