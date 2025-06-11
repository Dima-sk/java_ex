package scr.Timus;
import java.util.Scanner;

public class example28_1131 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество компьютеров N: ");
            int N = scanner.nextInt();
            System.out.print("Введите количество нуль-модемных шнуров K: ");
            int K = scanner.nextInt();

            int t = 0;
            int i = 1;

            while (i < N) {
                int count = Math.min(i, K);
                i += count;
                t++;
            }

            System.out.println("Минимальное время для копирования программы на все компьютеры: " + t + " часов");
        }
    }
