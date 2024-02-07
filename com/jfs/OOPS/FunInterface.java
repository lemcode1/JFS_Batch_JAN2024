package com.jfs.OOPS;


// Runnable, Comparable interfaces
@FunctionalInterface
public interface FunInterface {
    int sum(int a,int b); // adding a two values
}

class TestDemo1 {
    public static void main(String []args){
        FunInterface sumFun = (int a, int b) -> {
            return a+b; //lambda function/ lambda expression
        };

        FunInterface obj = new FunInterface(){ // anonymours inner class

            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        obj.sum(10,20);
        int finalSum = sumFun.sum(10,20);
    }
}

/*class TestDemo1 implements FunInterface {
     @Override
    public int sum(int a, int b) {
        return a+b;
    }
    public static void main(String []args){

    }


}*/
