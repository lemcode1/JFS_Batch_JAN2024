package OOPS;

import java.io.Serializable;

class Employee3 implements Cloneable{
    public String name;
    public String address;
    private int empId;

    public Employee3 (String name, String address, int empId) {
        this.name = name;
        this.address = address;
        this.empId = empId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ITestMarker {
    public static void main(String []args) throws CloneNotSupportedException {
        Employee3 employee3 = new Employee3("Kasi", "Ongole", 1234);
//        Employee3 employee4 = new Employee3("Kasi", "Ongole", 1234);
        Employee3 copyEmpObj = (Employee3) employee3.clone();
        System.out.println(copyEmpObj.name);
        System.out.println(employee3.name);

    }
}
