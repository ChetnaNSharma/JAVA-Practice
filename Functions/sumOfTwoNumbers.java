import java.util.*;

public class sumOfTwoNumbers {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sum(a, b);

        System.out.print("Sum is " + c);
    }
}
