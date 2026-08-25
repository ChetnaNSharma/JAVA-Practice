import java.util.*;

public class powLogN {

    public static int pow(int x, int n) {

        if (n == 1)
            return x;

        else if (n % 2 == 0)
            return pow(x, n / 2) * pow(x, n / 2);

        else
            return x * pow(x, n / 2) * pow(x, n / 2);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int x = sc.nextInt();

        System.out.println("Enter power");
        int n = sc.nextInt();
        int ans = pow(x, n);

        System.out.println(ans);
    }

}
