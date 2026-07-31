import java.util.*;

public class arrayOfNames {
    public static void main(String args[]) {

        System.out.println("Enter no. of names");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String names[] = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        System.out.println("Names are - ");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

    }
}
