package scr.Timus;
import java.util.Scanner;

public class example28_1327 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int first = (A % 2 == 1) ? A : A + 1;
            int last = (B % 2 == 1) ? B : B - 1;

            if (first > last) {
                System.out.println(0);
            } else {
                int count = (last - first) / 2 + 1;
                System.out.println(count);
            }
        }
}
