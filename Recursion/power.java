
import java.util.*;

public class power {

    public static int pow(int n, int x) {
        if (n == 0)
            return 1;

        return x * pow(n - 1, x);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int x = sc.nextInt();

        System.out.println("Enter power");
        int n = sc.nextInt();

        int ans = pow(n, x);
        System.out.println(ans);

    }

}
