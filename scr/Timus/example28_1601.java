package scr.Timus;
import java.util.Scanner;
public class example28_1601 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StringBuilder input = new StringBuilder(scanner.nextLine());

            boolean newStr = true;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (newStr && Character.isLetter(c)) {
                    input.setCharAt(i, Character.toUpperCase(c));
                    newStr = false;
                } else if (!newStr && Character.isLetter(c)) {
                    input.setCharAt(i, Character.toLowerCase(c));
                }

                if ("!.?".indexOf(c) >= 0) {
                    newStr = true;
                }
            }

            System.out.println(input);
        }
}
