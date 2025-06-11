package scr.Timus;

import java.util.Scanner;

public class example28_1785 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество монстров: ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 4) {
            System.out.println("несколько");
        } else if (num >= 5 && num <= 9){
            System.out.println("немного");
        }else if (num >= 10 && num <= 19){
            System.out.println("отряд");
        }else if (num >= 20 && num <= 49){
            System.out.println("толпа");
        }else if (num >= 50 && num <= 99){
            System.out.println("орда");
        }else if (num >= 100 && num <= 249){
            System.out.println("множество");
        }else if (num >= 250 && num <= 499){
            System.out.println("сонмище");
        }else if (num >= 500 && num <= 999){
            System.out.println("полчище");
        }else if (num >= 1000){
            System.out.println("легион");
        }else {
            System.out.println("монстров нет");
        }
        scanner.close();
    }
}
