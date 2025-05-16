package scr.lab2;
import java.util.Scanner;
public class example28_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int thousands = (number / 1000) % 10;

        if(thousands != 0) {
            System.out.println("Во введенном числе : " + thousands + " тыс.");
        }else {
            System.out.println("Во введенном числе нет тыс.");
        }
        scanner.close();
    }
}
