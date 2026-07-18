
import java.util.*;

public class FloydTriangle {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int i = 1;

        for (int j = 1; j <= row; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
    }

}
