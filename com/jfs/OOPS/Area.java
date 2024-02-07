
package com.jfs.OOPS;

import static com.jfs.advanceconcepts.PackagesTest.JAVA_BATCH_NAME;
public class Area {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length){
        this.length= length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        if(breadth>=0) {
            this.breadth = breadth;
        }
    }

    public void getArea(){
        int area = breadth * length;
        System.out.println("Area is :"+area);
    }
}

class MainTest {
    public static void main(String[] args) {
        Area area = new Area();
        area.setBreadth(4); // area.breadth=4
        area.setLength(5);
        area.getArea();
        System.out.println(JAVA_BATCH_NAME);

    }
}

