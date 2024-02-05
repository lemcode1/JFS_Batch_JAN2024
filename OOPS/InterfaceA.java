package OOPS;

public interface InterfaceA {

    default void method3() {
        System.out.println("method3");
    }

    void method1();
    void method2();
}

class Xyz implements InterfaceA {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

class Abc implements InterfaceA {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
