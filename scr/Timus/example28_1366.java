package scr.Timus;
import java.util.Scanner;

public class example28_1366 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println(1);
                return;
            }

            long[] exchange = new long[n + 1];
            exchange[0] = 1;
            exchange[1] = 0;

            for (int i = 2; i <= n; i++) {
                exchange[i] = (i - 1) * (exchange[i - 1] + exchange[i - 2]);
            }

            System.out.println(exchange[n]);
        }
}
