public class CmdLineInput {
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        float a= Float.parseFloat(args[0]);
        float b= Float.parseFloat(args[1]);
        System.out.println("Sum of a\"s and \n b\"s two\t values is "+(a+b));
//        System.out.println("I am attending Kasi\"s class");
        //System.out.println("I am attending Kasi \f class");
        System.out.println("I am attending Kasi \r class");
    }
}
