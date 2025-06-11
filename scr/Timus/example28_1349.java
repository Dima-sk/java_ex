package scr.Timus;
import java.util.Scanner;

public class example28_1349 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println(-1);
                return;
            }

            // Перебираем все возможные значения a, b, c
            for (int a = 1; a <= 100; a++) {
                for (int b = 1; b <= 100; b++) {
                    if (a == b) continue;
                    for (int c = 1; c <= 100; c++) {
                        if (c == a || c == b) continue;

                        double left = Math.pow(a, n) + Math.pow(b, n);
                        double right = Math.pow(c, n);

                        // Используем небольшую погрешность из-за работы с double
                        if (Math.abs(left - right) < 1e-6) {
                            System.out.println(a + " " + b + " " + c);
                            return;
                        }
                    }
                }
            }

            System.out.println(-1);
        }
}
