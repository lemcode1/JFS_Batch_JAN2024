package com.jfs.advancedjava;

import java.sql.*;
import java.util.Scanner;

class EmployeeVO { // VO, Bean, DAO, Pojo, DTO
    private String ename;

    private int empid;

    private double sal;

    public EmployeeVO(String ename, int empid, double sal) {
        this.ename = ename;
        this.empid = empid;
        this.sal = sal;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
public class JdbcSelect {

    /**
     * This method is used for creating/inserting new employee
     */
    public void createEmployee(EmployeeVO employeeVO) throws SQLException {
        Connection conn = null;
//        Statement statement = null;
        PreparedStatement pstmt = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();
            String insertQuery = "insert into employee(ename, sal) values(?,?)";
            pstmt = conn.prepareStatement(insertQuery);

            pstmt.setString(1, employeeVO.getEname());
            pstmt.setDouble(2, employeeVO.getSal());

//            statement = conn.createStatement();
//            String insertQuery = "insert into employee(ename, sal) values('"+employeeVO.getEname()+"',"+employeeVO.getSal()+")";
            System.out.println("insertQuery after framing: "+ insertQuery);
//            int rowsEffected = statement.executeUpdate(insertQuery);
            int rowsEffected = pstmt.executeUpdate();
            if (rowsEffected>0) {
                System.out.println("employee is created succesfully");
            } else {
                System.out.println("There is an issue in adding an employee");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
            pstmt.close();
        }
    }

    public void updateEmployee(EmployeeVO employeeVO) {

    }

    public void deleteEmployee(int empId) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = DatabaseConnection.getDatabaseConnection();
            String deleteQuery = "delete from employee where empid=?";
            pstmt = connection.prepareStatement(deleteQuery);
            pstmt.setInt(1, empId);
            int deletedRows = pstmt.executeUpdate();
            if(deletedRows == 1) {
                System.out.println("Employee "+empId+" deleted succesfully");
            } else if(deletedRows == 0) {
                System.out.println("No employee exist with the given empid "+empId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                pstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void selectEmployeeById() {

    }
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

    private static void optionsHandler(int option) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        JdbcSelect jdbcSelect = new JdbcSelect();
        if (option == 1 || option == 2) {
            System.out.println("Please enter a name of the employee");
            String name = scanner.nextLine();
            System.out.println("Please enter a sal of the employee");
            Double sal = scanner.nextDouble();
            EmployeeVO employeeVO = new EmployeeVO(name, 0, sal);
            if (option == 1)
                jdbcSelect.createEmployee(employeeVO);
            else
                jdbcSelect.updateEmployee(employeeVO);
        } else if (option == 3) {
            System.out.println("Please enter empid for deletion: ");
            int empid = scanner.nextInt();
            jdbcSelect.deleteEmployee(empid);
        } else if (option == 4){

        } else {
            System.out.println("Option you selected is not available please choose correct option");
        }
    }

    public static void main(String[] args) throws SQLException {
//        new JdbcSelect().selectAllEmployees();
        // create an employee
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of operation you want to do?");
        System.out.println("1. Create employee");
        System.out.println("2. Update employee");
        System.out.println("3. Delete employee");
        System.out.println("4. Select employee");
        int option = scanner.nextInt(); // this is to take option from the user

        optionsHandler(option);

    }
}
