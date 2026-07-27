import java.util.*;

public class eligibleVoter {

    public static String eligibility(int age) {
        if (age <= 18)
            return "Cannot vote";
        else
            return "Can vote";
    }

    public static void main(String args[]) {

        System.out.println("Enter age");

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        String c = eligibility(age);

        System.out.println(c);
    }

}
