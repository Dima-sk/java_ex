package scr.Timus;
import java.util.Scanner;

public class example28_1545 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();

            // Справочник иероглифов
            String[] glyphs = new String[N];
            for (int i = 0; i < N; i++) {
                glyphs[i] = scanner.next();
            }

            char inputChar = scanner.next().charAt(0);

            // Поиск подходящих иероглифов
            for (String glyph : glyphs) {
                if (glyph.length() >= 1 && glyph.charAt(0) == inputChar) {
                    System.out.println(glyph);
                }
            }
        }
}
