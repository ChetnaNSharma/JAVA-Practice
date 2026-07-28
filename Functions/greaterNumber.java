import java.util.*;

public class greaterNumber {

    public static int greater(int a, int b) {

        if (a >= b)
            return a;
        else
            return b;

    }

    public static void main(String args[]) {

        System.out.println("Enter 2 numbers to get the greater number");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = greater(a, b);
        System.out.println("Greater number is " + c);

    }

}
