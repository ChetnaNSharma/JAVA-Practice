import java.util.*;

public class inputAnalysis {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of inputs");

        int n = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int zer = 0;
        int k = 0;

        for (int i = 1; i <= n; i++) {

            k = sc.nextInt();

            if (k < 0)
                neg++;
            else if (k == 0)
                zer++;
            else
                pos++;
        }

        System.out.println("Negative : " + neg + " Zeros : " + zer + " Positive " + pos);
    }

}
