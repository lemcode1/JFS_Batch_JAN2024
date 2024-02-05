package OOPS;

public interface ITest {
    int a =10;

    default void display() {
        System.out.println("Inside display");
    }
}

class Test2 implements ITest {


    public static void main(String []args) {
        Test2 obj = new Test2();
        obj.display();
    }
}
