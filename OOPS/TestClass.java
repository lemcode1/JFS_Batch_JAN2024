package OOPS;

class Class1 {
    void test() {
        System.out.println("Inside a");
    }
}

class Class2 {
    void test(){
        System.out.println("Inside 2");
    }
}

public class TestClass extends A,B{
     public static void main(String []args){
        Class1 a = new TestClass();
         a.test();
        Class2 b = new TestClass();
     }
}
