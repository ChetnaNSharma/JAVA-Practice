import java.util.*;

public class checkOrder {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size if array");

        int size = sc.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                System.out.println("Not acending");
                return;
            }
        }
        System.out.println("Acending order");

    }
}
