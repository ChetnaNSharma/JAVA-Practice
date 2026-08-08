import java.util.*;

public class username {
    public static void main(String args[]) {
        System.out.println("Enter mail ID");

        Scanner sc = new Scanner(System.in);

        StringBuilder email = new StringBuilder(sc.next());
        String username = "";
        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@')
                username = email.substring(0, i);
        }
        System.out.println("Username is : " + username);
    }

}
