import java.util.*;

public class factorial {

    public static int factorial(int a) {
        if (a == 1)
            return 1;
        else
            return a * factorial(a - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. for its factorial ");
        int a = sc.nextInt();

        System.out.print("Factorial of number is : " + factorial(a));
    }

}
