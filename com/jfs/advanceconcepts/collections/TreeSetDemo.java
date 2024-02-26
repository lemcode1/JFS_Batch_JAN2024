package com.jfs.advanceconcepts.collections;

import java.util.Comparator;
import java.util.TreeSet;

class EmpNameComparator implements  Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee obj1 = (Employee) o1;
        Employee obj2 = (Employee) o2;
        return obj1.name.compareTo(obj2.name);
    }
}

class SalaryComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee obj1 = (Employee) o1;
        Employee obj2 = (Employee) o2;

        if (obj1.salary > obj2.salary) {
            return -1;
        } else if(obj1.salary == obj2.salary) {
            return 0;
        } else{
            return 1;
        }
    }
}
class Employee{
    int empno;
    double salary;
    String name;

    public Employee(int empno, double salary, String name) {
        this.empno = empno;
        this.salary = salary;
        this.name = name;
    }

//    @Override
//    public int compareTo(Object o) {
//        Employee empObj = (Employee) o;
////        return this.salary > empObj.salary ? 1 : (this.salary == empObj.salary) ? 0 : -1;
//        if (this.empno > empObj.empno) {
//            return 1;
//        } else if(this.empno == empObj.empno) {
//            return 0;
//        } else{
//            return -1;
//        }
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TreeSetDemo {
    public static void main(String[] args){

//        TreeSet<String> treeSet = new TreeSet();
//        treeSet.add(null);
//        treeSet.add("Z");
//        treeSet.add("B");
//        treeSet.add("A");
//        treeSet.add("Y");
//        treeSet.add("K");
//        treeSet.add(null); //NullPointerException
//        treeSet.add(10); // ClassCastException

        TreeSet<StringBuffer> treeSet = new TreeSet<>();
        treeSet.add(new StringBuffer("Z"));
        treeSet.add(new StringBuffer("B"));
        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("Y"));
        System.out.println(treeSet);

//        TreeSet<Employee> employeeTree = new TreeSet<>();
        TreeSet<Employee> employeeTree = new TreeSet<>(new SalaryComparator());
        employeeTree.add(new Employee(2, 20000.00, "Ram"));
        employeeTree.add(new Employee(1, 10000.00, "Lakshman"));
        employeeTree.add(new Employee(3, 30000.00, "Sita"));
        employeeTree.add(new Employee(5, 10000.00, "Bharath"));

//        System.out.println(treeSet.add("Y"));
        for(Employee employee: employeeTree) {
            System.out.println(employee);
        }
        System.out.println("Z".compareTo("A")); // +ve
        System.out.println("A".compareTo("K")); // -ve
        System.out.println("Z".compareTo("Z")); // 0
        System.out.println(new Integer(4).compareTo(new Integer(3))); // +ve
        System.out.println(new Integer(1).compareTo(new Integer(3))); // -ve
        System.out.println(new Integer(4).compareTo(new Integer(4)));  //0
    }
}
