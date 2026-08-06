
import java.util.*;

public class replaceLetter {
    public static void main(String args[]) {

        System.out.println("Enter a string");

        Scanner sc = new Scanner(System.in);

        StringBuilder word = new StringBuilder(sc.next());

        StringBuilder result = new StringBuilder(word);

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'e')
                result = word.setCharAt(i, 'i');
        }

        System.out.println(result);
    }

}
