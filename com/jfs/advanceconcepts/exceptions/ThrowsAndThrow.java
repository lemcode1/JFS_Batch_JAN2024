package com.jfs.advanceconcepts.exceptions;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;



public class ThrowsAndThrow {

    public static Connection getDatabaseConn() throws SQLException {
        return null;
    }

    public static void divideByZero() throws SQLException {
        throw new SQLException("Trying to divide by zero, non-zero values are expected");
    }

    public static void divideNumber() throws ArithmeticException, NumberFormatException {
        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.print("Enter a value");
        int a = Integer.parseInt(sc.nextLine()); // abc
        System.out.print("Enter b value");
        int b = sc.nextInt();
        int division = a / b; // logic
        System.out.println("Divsion of a and b is :" + division);
    }

    public static void main(String[] args) throws SQLException {
        try {
            divideByZero();
        } catch (Exception e) {

        }
        /*try {
            getDatabaseConn(); //1 exception
            divideNumber(); // 2exception
            Patient patient = new Patient();
            patient.getPatientInfo("1234");
        } catch(NumberFormatException | ArithmeticException ne) {
            if (ne instanceof NumberFormatException) {
                System.out.println("Provide only integer value, looks like you have entered string values");
            }
            if (ne instanceof ArithmeticException) {
                System.out.println("Please provider only numberic values which are non-zero");
            }
        }*/
    }
}
