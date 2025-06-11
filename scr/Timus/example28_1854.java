package scr.Timus;
import java.util.Scanner;

public class example28_1854 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n = scanner.nextLong();

            long maxDivisor = 1;
            long sqrtN = (long) Math.sqrt(n);

            for (long i = sqrtN; i >= 1; i--) {
                if (i % 2 == 0) continue;
                long square = i * i;
                if (n % square == 0) {
                    maxDivisor = square;
                    break;
                }
            }

            System.out.println(maxDivisor);
        }
}
