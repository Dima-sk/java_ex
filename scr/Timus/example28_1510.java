package scr.Timus;
import java.util.Scanner;

public class example28_1510 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();

            int count = 0;
            long banknote = 0;

            for (int i = 0; i < N; i++) {
                long num = scanner.nextLong();

                if (count == 0) {
                    banknote = num;
                    count = 1;
                } else if (num == banknote) {
                    count++;
                } else {
                    count--;
                }
            }

            System.out.println(banknote);
        }
}
