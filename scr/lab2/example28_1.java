package scr.lab2;
import java.util.Scanner;
public class example28_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("Число " + number + " делится на 3.");
        } else {
            System.out.println("Число " + number + " не делится на 3.");
        }
        scanner.close();
    }
}

