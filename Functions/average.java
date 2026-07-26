import java.util.*;

public class average {

    public static void printAverage(float a, float b, float c) {

        float d = (a + b + c) / 3;
        System.out.println("Average is " + d);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers to find average");

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        printAverage(a, b, c);
    }
}
