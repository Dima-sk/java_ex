package scr.lab2;

import java.util.Scanner;

public class example28_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number >= 5 && number <= 10) {
            System.out.println("Число " + number + " попадает в диапозон.");
        } else {
            System.out.println("Число " + number + " не попадает в диапозон.");
        }
        scanner.close();
    }
}
