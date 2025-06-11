package scr.Timus;
import java.util.Scanner;

public class example28_1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int[] votes = new int[N + 1]; // индекс от 1 до N

            for (int i = 0; i < M; i++) {
                int candid = scanner.nextInt();
                if (candid >= 1 && candid <= N) {
                    votes[candid]++;
                }
            }

            for (int i = 1; i <= N; i++) {
                double percent = (double) votes[i] * 100 / M;
                System.out.printf("%.2f%%\n", percent);
            }
        }
    }

