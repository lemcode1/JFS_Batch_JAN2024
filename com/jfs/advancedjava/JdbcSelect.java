package com.jfs.advancedjava;

import java.sql.*;

public class JdbcSelect {

    public void selectAllEmployees() throws SQLException {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();
            // Create a statement
            statement = conn.createStatement();
            String selectQuery = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp";
            // execute the query
            ResultSet resultSet = statement.executeQuery(selectQuery);
            System.out.println("empno ename job mgr hiredate sal comm deptno");
            while(resultSet.next()) {
                String empno = resultSet.getString("empno");
                String ename = resultSet.getString("ename");
                String job = resultSet.getString("job");
                String mgr = resultSet.getString("mgr");
                String hiredate = resultSet.getString("hiredate");
                String sal = resultSet.getString("sal");
                String comm = resultSet.getString("comm");
                String deptno = resultSet.getString("deptno");
                System.out.println(empno+ " "+ ename +" "+ job+ " "+mgr+ " "+hiredate+" "+sal+ " "+comm+ " "+deptno);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
            statement.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        new JdbcSelect().selectAllEmployees();
    }
}
