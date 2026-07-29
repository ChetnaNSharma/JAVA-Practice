import java.util.*;

public class power {

    public static void pow(int a, int b) {

        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        System.out.println(ans);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. and power to be calculated");

        int a = sc.nextInt();
        int b = sc.nextInt();

        pow(a, b);

    }
}
