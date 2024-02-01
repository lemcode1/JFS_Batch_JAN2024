class GrandParent {
     void methodGrandP() {
         System.out.println("inside grand parent");
     }
}

class Parent extends GrandParent {
    void methodParent() {
        System.out.println("inside parent");
    }
}

class Child extends Parent {
    void methodChild() {
        System.out.println("inside child");
    }
}

public class GrandChild extends Child {

    void grandChild() {
        System.out.println("Inside grand child");
    }

    public static void main(String []args) {
        Child child = new Child();
        child.methodChild();
        child.methodParent();
        child.methodGrandP();

        GrandParent grandParent = new GrandParent();
        grandParent.methodGrandP();

        Parent parent = new Child();
        parent.methodParent();
        parent.methodGrandP();



    }

}
