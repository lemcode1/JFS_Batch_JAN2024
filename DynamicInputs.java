import java.util.Scanner;
public class DynamicInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dear user, please enter first value : ");
        int a = sc.nextInt();
        System.out.print("Dear user, please enter second value : ");
        int b = sc.nextInt();
        System.out.println("Sum of two values is " + (a+b));
    }
}
