package scr.lab2;

import java.util.Scanner;

public class example28_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 5 == 2 && number % 7 == 1) {
            System.out.println("Число " + number + " удовлетворяет условию.");
        } else {
            System.out.println("Число " + number + " не удовлетворяет условию.");
        }
        scanner.close();
    }
}
