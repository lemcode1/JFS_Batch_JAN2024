public class Animal2 {
    int legs;

    public Animal2(){
        System.out.println("Animal2 default constructor");
    }

    public Animal2(int legs, int b) {
        this.legs = legs;
        System.out.println("Inside param constructor of animal2");
    }

    public void countLegs() {
        System.out.println("Inside animal method");
    }
}

class Tiger extends Animal2{
    public Tiger(int legs, int b) {
        super(legs,b);
        System.out.println("Tiger default constructor");
        System.out.println(super.legs);
    }

    public void countLegs() {
        System.out.println("Inside tiger method");
    }

    public void test(){
//        super.countLegs(); // will be called parent clas method
        countLegs();
    }


    public static void main(String[] args){
        Tiger tiger = new Tiger(4,2);
        tiger.countLegs();
    }
}
