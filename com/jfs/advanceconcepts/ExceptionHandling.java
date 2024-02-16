package com.jfs.advanceconcepts;

import java.sql.Connection;
import java.util.Scanner;



public class ExceptionHandling {

    public static void main(String []args){
        Scanner sc = null;
        Connection conn = null;
        try {
//            conn.createStatement();
            sc = new Scanner(System.in);
            System.out.print("Enter a value");
            int a = Integer.parseInt(sc.nextLine()); // abc
            System.out.print("Enter b value");
            int b = sc.nextInt();
            int division = a / b; // logic
            System.out.println("Divsion of a and b is :" + division);
        } catch(ArithmeticException | NumberFormatException ne) {
            System.out.println(ne);
            System.out.println();
            ne.printStackTrace();
//            System.out.println(ne.getLocalizedMessage());
//            ne.getCause().getStackTrace();
            System.out.println(ne.getMessage());
            if (ne instanceof NumberFormatException) {
                System.out.println("Provide only integer value, looks like you have entered string values");
            }
            if (ne instanceof ArithmeticException) {
                System.out.println("Please provider only numberic values which are non-zero");
            }
        }  finally {
            if (sc !=null ) {
                sc.close();
            }
        }

        System.out.println("outside try finally");


        /*catch (NumberFormatException ne) {
            System.out.println("Provide only integer value, looks like you have entered string values");
        } *//*catch (Exception e) {
            System.out.println("Please provider only numberic values which are non-zero");
        }*/
    }


}
