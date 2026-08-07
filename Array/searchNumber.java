import java.util.*;

public class searchNumber {
    public static void main(String args[]) {
        System.out.println("Enter size of array ");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int marks[] = new int[size];

        System.out.println("Enter marks to be stored in array ");

        for (int i = 0; i < size; i++) {

            marks[i] = sc.nextInt();

        }

        System.out.println("Enter marks for which index needs to be searched ");

        int find = sc.nextInt();

        for (int i = 0; i < size; i++) {

            if (marks[i] == find) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Not found");

    }
}
