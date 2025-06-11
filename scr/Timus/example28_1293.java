package scr.Timus;
import java.util.Scanner;

public class example28_1293 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            long totalArea = (long) N * A * B * 2;
            System.out.println(totalArea);
        }
}

