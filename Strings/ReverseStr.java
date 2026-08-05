
import java.util.*;

public class ReverseStr {

    public static void main(String args[]) {
        System.out.println("Enter a word to reverse");

        Scanner sc = new Scanner(System.in);

        StringBuilder word = new StringBuilder(sc.next());

        for (int i = 0; i < word.length() / 2; i++) {

            char s = word.charAt(i);
            int j = word.length() - 1 - i;
            word.setCharAt(i, word.charAt(j));
            word.setCharAt(j, s);
        }

        System.out.println(word);
    }
}
