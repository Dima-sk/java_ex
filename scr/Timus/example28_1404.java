package scr.Timus;
import java.util.Scanner;

public class example28_1404 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String encrypted = scanner.nextLine();

            int n = encrypted.length();
            int[] shifr = new int[n];
            int[] word = new int[n];

            for (int i = 0; i < n; i++) {
                shifr[i] = encrypted.charAt(i) - 'a';
            }

            word[0] = (shifr[0] - 5) % 26;
            if (word[0] < 0) word[0] += 26;

            for (int i = 1; i < n; i++) {
                word[i] = (shifr[i] - shifr[i - 1]) % 26;
                if (word[i] < 0) word[i] += 26;
            }

            StringBuilder result = new StringBuilder();
            for (int value : word) {
                result.append((char) ('a' + value));
            }

            System.out.println(result);
        }
}
