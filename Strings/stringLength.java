import java.util.*;

public class stringLength {
    public static void main(String args[]) {

        System.out.println("Enter size of array of strings");

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String words[] = new String[size];

        System.out.println("Enter words");
        int sum = 0;

        for (int i = 0; i < size; i++) {

            words[i] = sc.next();

            sum = sum + words[i].length();
        }

        System.out.println("Length : " + sum);
    }
}
