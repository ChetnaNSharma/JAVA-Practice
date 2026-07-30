import java.util.*;

public class sumOfOddNumbers {

    public static void sumOfOdd(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum of odd numbers till " + n + " is " + sum);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int n = sc.nextInt();

        sumOfOdd(n);
    }
}
