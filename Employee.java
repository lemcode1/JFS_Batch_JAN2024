public class Employee {
    int empid = 144;
    String ename;
    String role;
    float salary;
    static int age;

    Employee(int age) {
        Employee.age = age;
    }

    void dispalyEmployeeInfo() {
//        System.out.println(empid);
//        System.out.println(role);
//        System.out.println(ename);
//        System.out.println(salary);
    }

    public static void main(String []args) {
        System.out.println("Inside main method");
        Employee emp_obj = new Employee(23); //object creation
        System.out.println(emp_obj.age);
//        emp_obj.empid;
//        emp_obj.ename;
        emp_obj.dispalyEmployeeInfo();

        Employee emp_obj2 = new Employee(24);
        System.out.println(emp_obj2.age);

    }

}
