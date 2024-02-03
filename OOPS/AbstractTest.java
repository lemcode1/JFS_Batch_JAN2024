package OOPS;

abstract class A {
    int a;
    int b;
    A() {
        System.out.println("Inside A default");
    }
    abstract int sum(int a, int b);  // unimplemented/abstract method

    void display() {  // full implemented/ concrete method
        System.out.println("display");
    }
}

class B extends A {

    B (int a, int b) {
        super.a = a;
        super.b = b;
    }
    @Override
    int sum(int a, int b) {
        return a+b;
    }
}

public class AbstractTest {
    public static void main(String []args) {
//        A a = new B();
         A a = new B(20,30);
         B b = new B(20,30);
         int finalSum = a.sum(20,30);
        int finalSum2 = b.sum(200,300);
        System.out.println(finalSum);
        System.out.println(finalSum2);
    }
}
