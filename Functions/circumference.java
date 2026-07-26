import java.util.*;

public class circumference {

    public static float calculateCircum(int radius) {

        float pi = 22f / 7;
        return 2 * pi * radius;
    }

    public static void main(String args[]) {

        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();

        float c = calculateCircum(radius);

        System.out.println("Circumference of circle is " + c);

    }

}
