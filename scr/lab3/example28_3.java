package scr.lab3;
import java.util.Scanner;
public class example28_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Число должно быть положительным!");
            return;
        }

        int a = 1, b = 1;
        System.out.print("Последовательность Фибоначчи(через for): ");

        if (n >= 1) System.out.print(a);
        if (n >= 2) System.out.print(", " + b);

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();

        a = 1;
        b = 1;
        System.out.print("Последовательность Фибоначчи(через while): ");

        if (n >= 1) System.out.print(a);
        if (n >= 2) System.out.print(", " + b);

        int i = 3;
        while (i <= n) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
            i++;
        }
        System.out.println();
        a = 1;
        b = 1;
        System.out.print("Последовательность Фибоначчи(через do-while): ");

        if (n >= 1) System.out.print(a);
        if (n >= 2) System.out.print(", " + b);

        i = 3;
        do {
            if (i > n) break; // Выход, если n < 3
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
            i++;
        } while (i <= n);
        scanner.close();
    }
}

