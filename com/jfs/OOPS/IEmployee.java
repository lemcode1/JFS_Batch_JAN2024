package com.jfs.OOPS;

interface ITest2 {
    void test();
}

class Test3 {
    void demoTest() {
        System.out.println("inside demo test");
    }
}

public interface IEmployee { //

    default void employeeDetails() {
        System.out.println("Inside default methods");
    }

    void test();

    public static final String college = "SSN";
    void getEmployeeInfo();  // public abstract void getEmployeeInfo();

    void deleteEmployee();

    void addEmployee();

    void updateEmployee();
}

class EmployeeClass extends Test3 implements IEmployee, ITest2 {

    public void getEmployeeInfo() {
        System.out.println("Inside getemployee");
    }

    @Override
    public void deleteEmployee() {
        System.out.println("Inside deleteEmployee");
    }

    @Override
    public void addEmployee() {
        System.out.println("Inside addEmployee");
    }

    @Override
    public void updateEmployee() {
        System.out.println("Inside updateEmployee");
    }

    @Override
    public void test() {
        System.out.println("Inside test method");
    }
}

class Demo {
    public static void main(String[] args) {
        IEmployee employee = new EmployeeClass();
        employee.updateEmployee();
        employee.test();
        System.out.println(IEmployee.college);
        employee.test();
        ITest2 test2 = new EmployeeClass();
        test2.test();
    }
}