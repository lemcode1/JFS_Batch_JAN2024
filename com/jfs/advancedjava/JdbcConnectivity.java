package com.jfs.advancedjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectivity {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DatabaseConnection.getDatabaseConnection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            String query = "insert into emp(empno, ename,deptno) values(1122, 'JDBC', 40)";

            statement.execute(query);
            connection.commit(); // it is mandatory only when you are executing DML query
            System.out.println("Insertion is successfull");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
                if (statement!=null)
                    statement.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
