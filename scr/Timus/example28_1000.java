package scr.Timus;

import java.util.Scanner;

public class example28_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        int sum = a+b;
        System.out.println("Сумма чисел равна: "+sum);
    }
}
