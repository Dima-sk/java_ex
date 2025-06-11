package scr.Timus;
import java.util.Scanner;
public class example28_1068 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int N = scanner.nextInt();

            int sum = 0;
            if (N >= 1) {
                for(int i = 1; i <= N; i++) {
                    sum += i;
                }
            } else {
                N = Math.abs(N);
                for(int i = N; i >= -1; i--) {
                    sum += -i;
                }
            }

            System.out.println(sum);
        }
}

