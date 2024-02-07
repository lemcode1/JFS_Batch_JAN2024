package com.jfs.OOPS;

interface Marker1 {

}

class Ab implements Cloneable {
    int i;
    String s;

    public Ab(int i, String s) {
        this.i =i;
        this.s = s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class MarkerInterface {
    public static void main(String []args) throws CloneNotSupportedException {

        Ab a = new Ab(10,"Java");
        Ab b = (Ab)a.clone();
        System.out.println(a.i);
        System.out.println(b.i);
    }
}
