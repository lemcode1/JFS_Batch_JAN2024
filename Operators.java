public class Operators {
    public static void main(String[] args){
        // Arithmatic operators
        int x=20;
        int y=10;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println(x*y);
        // Unary operators
        System.out.println("post increment operator " + x++); // 21
        System.out.println("pre increment operator " + ++x);  //
        System.out.println("post decrement operator " + y--);
        System.out.println("pre decrement operator " + --y);

        // Assignment operators
        float a=200;
        a+=10; // a=a+10 a=200+10 a = 210
        System.out.println(a);
        a-=20;
        System.out.println(a);
        a/=20;
        System.out.println(a);
        a%=20;
        System.out.println(a);
        a*=20;
        System.out.println(a);

        // Relational operators
        int c=40;
        int d=50;
        System.out.println(c==d);// false
        System.out.println(c<=d);// true
        System.out.println(c<d);// true
        System.out.println(c>=d);// false
        System.out.println(c>d); // false

//        System.out.println("Hello World" +10 +10);
//        System.out.println(10+10+"Hello World");
        //Logial operators
        boolean s= true;
        boolean t= false;
        System.out.println(s && t); //false
        System.out.println(s || t); // true
        System.out.println(!t); // true

        // ternary operator
        int age = 10;
        String result_msg = age>=18 ? "you are eligible for vote" :
                "you are not eligible for vote";
        System.out.println(result_msg);


    }
}
