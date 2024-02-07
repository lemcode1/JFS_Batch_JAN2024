package OOPS;

interface Deletable {

}

class Vehicle {
    void delete () {

    }
}

class Student extends Vehicle implements Deletable {
    String name;
    int rollno;

    Student(int rollno, String name) {
        this.name = name;
        this.rollno = rollno;
    }

    void display() {
        System.out.println("Name "+name+ " rollno "+ rollno);
    }

    void delete() {
        Vehicle vehicle = new Vehicle();
        vehicle.delete();
        System.out.println("Delete object of student");
    }
}
public class CustomerMarkerInterface {
    public static void main(String []args) throws Exception {
        Student student = new Student(123, "Raj");
        Vehicle vehicle = new Vehicle();
        if (vehicle instanceof Deletable) {
            vehicle.delete();
        }
        if (student instanceof Deletable) {
            student.delete();
        } else {
            throw new Exception("You are not allowed to delete");
        }
    }
}
