class ClassA {
    public int roll_no;

    void sum(int a, int b) {
        System.out.println("Inside class A sum");
    }

    public static void subtraction() {
        System.out.println("Inside static method of class A");
    }

    void multiplication(){
        System.out.println("Inside multiplication classA");
    }

}

public class ClassB extends ClassA {
//
    void multiplication(){
        System.out.println("Inside multiplication class B");
    }

    public static void main(String []args) {
        ClassA obj_a = new ClassA();
        System.out.println(obj_a.roll_no);
        obj_a.sum(4,5);
        obj_a.subtraction();
//        obj_a.multiplication();


        // create an object for child class and access the features of parent class
        ClassB objB = new ClassB();
        System.out.println(objB.roll_no);
        objB.sum(4,5);
        objB.subtraction();
        objB.multiplication();

        ClassA objA2 = new ClassB();
        objA2.multiplication();



    }

}
