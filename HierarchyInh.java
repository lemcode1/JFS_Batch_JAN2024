class Animal {
    public void sleeps() {
        System.out.println("Test1 method");
    }
}

class Lion extends Animal{
    public void sleeps() {
        System.out.println("lion method");
    }
}

class Rabbit extends Animal{
    public void sleeps() {
        System.out.println("Rabbit method");
    }
}

public class HierarchyInh {
    public static void main(String []args) {
        Animal animal = new Rabbit();
        animal.sleeps();
    }
}
