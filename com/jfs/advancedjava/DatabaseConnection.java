package com.jfs.advancedjava;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    static Properties properties = null;

    static {
        try {
            loadDatabaseProperties();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadDatabaseProperties() throws IOException {
        FileReader reader = new FileReader("C:\\Users\\kasiy\\IdeaProjects\\JFS_Batch_JAN2024\\com\\jfs\\advancedjava\\database.properties");
        properties = new Properties();
        properties.load(reader);
    }

    public static Connection getDatabaseConnection() {
        Connection conn = null;
        try {
            String url = properties.getProperty("database_url");
            String username = properties.getProperty("database_username");
            String password = properties.getProperty("database_password");
            // load the driver class
            Class.forName(properties.getProperty("database_driverClassName"));
            // Create a database connection
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException sq) {
            sq.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

}
