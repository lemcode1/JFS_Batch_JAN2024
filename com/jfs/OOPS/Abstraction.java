package com.jfs.OOPS;

abstract class Bus
{
    int a;
    abstract void accelerate();
}
class Volvo extends Bus
{
    void accelerate()
    {
        System.out.println("Volvo::accelerate");
    }
}

public class Abstraction {
    public static void main(String args[])
    {
        Bus obj = new Volvo(); //Bus object =>contents of Volvo
        obj.accelerate();  //call the method
    }
}
