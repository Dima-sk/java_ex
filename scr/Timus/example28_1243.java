package scr.Timus;
import java.util.Scanner;
public class example28_1243 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число N: ");
            String N = scanner.nextLine();

            int count = 0;
            for (int i = 0; i < N.length(); i++) {
                int num = N.charAt(i) - '0';
                count = (count * 10 + num) % 7;
            }

            System.out.println("Белоснежка получит: " + count + " шт.");
        }
}
